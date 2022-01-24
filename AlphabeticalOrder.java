package com.jagadeesh.java;

import java.util.HashMap;
import java.util.Scanner;

public class AlphabeticalOrder {

	public static void main(String[] args) {
		HashMap<Character,Integer> has = new HashMap<>();
	    has.put('A',0);
	    has.put('B',1);
	    has.put('C',2);
	    has.put('D',3);
	    has.put('E',4);
	    has.put('F',5);
	    has.put('G',6);
	    has.put('H',7);
	    has.put('I',8);
	    has.put('J',9);
	    has.put('K',10);
	    has.put('L',11);
	    has.put('M',12);
	    has.put('N',13);
	    has.put('O',14);
	    has.put('P',15);
	    has.put('R',16);
	    has.put('S',17);
	    has.put('T',18);
	    has.put('U',19);
	    has.put('V',20);
	    has.put('W',21);
	    has.put('X',22);
	    has.put('Y',23);
	    has.put('Z',24);
	   
	   Scanner scn=new Scanner(System.in);
	    String str = scn.nextLine();
	    int cur = 0 ;
	    boolean state = true;
	    for(char c : str.toCharArray()){
	        if (cur>has.get(c)){
	            state= false;
	            break;
	        }
	        cur=has.get(c);
	    }
	    System.out.println(state);


	}
}

