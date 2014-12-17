/*
 *  * This code solves the problem Chockolate Feast party from hacker rank
 * The url of the problem is: https://www.hackerrank.com/challenges/chocolate-feast
 */
package com.johir;

import java.util.Scanner;

public class ChockolateFeast {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0)
		{
			Long N=sc.nextLong();
			Long C=sc.nextLong();
			Long M=sc.nextLong();
			System.out.println(getChockolateNumber(N, C, M));
		}

	}
	public static Long getChockolateNumber(Long N,Long C, Long M){
		Long num=N/C;
		Long temp=num;
		
		while(temp>=M){
			Long mod=temp%M;
			temp=(temp)/M;
			num+=temp;
			temp=temp+mod;
			
		}
		return num;
	}

}
