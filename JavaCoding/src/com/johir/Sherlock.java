package com.johir;

import java.util.Scanner;

public class Sherlock {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int count=0;
		int T=sc.nextInt();
		while(T-->0){
			count=0;
			int A=sc.nextInt();
			int B=sc.nextInt();
			for(int i=1;i*i<=B;i++){
				if(i*i>=A)
					count++;
			}
			System.out.println(count);
		}

	}

}
