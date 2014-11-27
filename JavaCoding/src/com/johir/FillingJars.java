/*
 * This code solves the problem Filling Jars from Hackerrank
 * The problem is at: https://www.hackerrank.com/challenges/filling-jars
 * mislam@iastate.edu
 */
package com.johir;

import java.util.Scanner;

public class FillingJars {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		long N=sc.nextLong();
		long M=sc.nextLong();
		long total=0;
		while(M-->0){
			int a=sc.nextInt();
			int b=sc.nextInt();
			int fill=sc.nextInt();
			total+=(b-a+1)*fill;
		}
		System.out.println(total/(N));

	}

}
