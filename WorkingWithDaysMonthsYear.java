package com.jagadeesh.java;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class WorkingWithDaysMonthsYear {

	public static void main(String[] args) {
		Date date =new Date(0);
		SimpleDateFormat sdfmt = new SimpleDateFormat("E YYYY:MM:dd 'at' hh:mm:ss a zzz");
		System.out.println("Current Date ="+sdfmt.format(date));
		

	}

}
