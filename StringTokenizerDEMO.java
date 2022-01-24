package com.jagadeesh.java;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerDEMO {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter the Integers Seperated by comma(,):");
		String input =Scan.next();
		StringTokenizer str = new StringTokenizer(input,",");
		int sum=0;
		while(str.hasMoreTokens()) {
			int number=0;
			
			number=Integer.parseInt(str.nextToken());
			System.out.println("Number is:"+number);
			sum+=number;
		}
		System.out.println("Sum of the Integers is:"+sum);

	}

}
