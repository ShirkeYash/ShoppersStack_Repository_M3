package com.Shoppersstack.genricUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class fileUtility {
	
	FileInputStream fis;

	public String propertyFile(String key) throws IOException {
		fis = new FileInputStream(frameworkConstants.propertyPath);
		Properties pro = new Properties();
		pro.load(fis);
		String value=pro.getProperty(key);
		return value;
				
	}
	
	public String excelFile(String key, int rowNum, int celNum) throws EncryptedDocumentException, IOException {
		fis = new FileInputStream(frameworkConstants.excelPath);
		Workbook wb=WorkbookFactory.create(fis);
		String value=wb.getSheet(key).getRow(rowNum).getCell(celNum).getStringCellValue();
		return value;
	}
	
}
