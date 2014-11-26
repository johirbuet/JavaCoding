/*
 * This code will determine whether a number is fibbonaci number
 */
package com.johir;

import java.util.HashSet;
import java.util.Scanner;

public class isFibbo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Long> fibs=new HashSet<Long>();
		fibs=getFibs();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of times you want to check");
		int iter=sc.nextInt();
		for(int i=0;i<iter;i++){
			System.out.println("Enter the number:");
			long trial=sc.nextLong();
			System.out.println(fibs.contains(trial)?"IsFibo":"IsNotFibo");
		}

	}
	
	public static HashSet<Long> getFibs(){
		HashSet<Long> fibs=new HashSet<Long>();
		long a=1,b=1,c;
		long max=10000000000l;
		fibs.add(0l);
		fibs.add(1l);
		while(b<max){
			c=a+b;
			fibs.add(c);
			a=b;
			b=c;
		}
		return fibs;
	}

}
