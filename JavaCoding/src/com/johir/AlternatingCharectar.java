/*
 * 
 * 
 */
package com.johir;

import java.util.Scanner;

public class AlternatingCharectar {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int iter=sc.nextInt();
		for(int j=0;j<iter;j++){
			int count=0;
			String str=sc.nextLine();
			for(int i=0;i<str.length()-1;i++){
					if(str.charAt(i)==str.charAt(i+1))
				count++;
			}
			System.out.println(count);
		}
	}
	

}
