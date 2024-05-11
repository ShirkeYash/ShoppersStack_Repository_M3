package com.Shoppersstack.genricUtility;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Random;


public class javaUtility {
	
	public int ramdomNumber() {
		Random r=new Random();
		int num=r.nextInt(1000);
		return num;
	}
	
	public String localDate() {
		return LocalDate.now().toString().replace("-", "");
	}
	
	public String localDateTime() {
		return LocalDateTime.now().toString().replace("-", "").replace(":", "").replace(".", "");
	}

}
