/*
 * This code solves the problem Halloween party from hacker rank
 * The url of the problem is: https://www.hackerrank.com/challenges/halloween-party
 */
package com.johir;

import java.util.Scanner;

public class Halloween {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		
		while(T-->0)
		{
			Long K=sc.nextLong();
			if(K%2==0){
				System.out.println(K/2*K/2);
			}
			else
				System.out.println(K/2*(K/2+1));
		}
		

	}

}
