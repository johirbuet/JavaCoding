package com.johir;

import java.util.Scanner;

public class charectarChangeforMakingPalyndrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int iter=sc.nextInt();
		sc.nextLine();
		while(iter-->0){
			String str=sc.nextLine();
			System.out.println(getTotalChange(str));
		}
	}
	public static int getTotalChange(String str){
		int count=0;
		int len=str.length();
//		if(len%2==0){
			for(int i=0;i<len/2;i++){
				count+=Math.abs(str.charAt(len-1-i)-str.charAt(i));
			}
//		}
		return Math.abs(count);
	}

}
