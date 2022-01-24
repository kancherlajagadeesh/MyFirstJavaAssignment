package com.jagadeesh.java;

public class GetSorted {

	public static void main(String[] args) {
		int[] arr = new int [] {11,12,13,14,15};
		System.out.println("String sorted array");
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i]+ " ");
		}
		System.out.println("String in reverse order");
		for(int i=arr.length - 1; i>=0; i--) {
		System.out.println(arr[i]+ " ");
	}
	

	}

}
