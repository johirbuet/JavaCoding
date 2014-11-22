
/*
 * Md Johirul Islam; mislam@iastate.edu
 * 
 * This code will check whether a number is palindrome
 */
package com.johir;

import java.io.Console;
import java.util.Scanner;

public class CheckPalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int reverse=0;
		int number=0;
		Scanner input=new Scanner(System.in);
		Console c=System.console();
		System.out.println("Enter The number:");
		if(c!=null){
		number=Integer.parseInt(c.readLine());
		}
		else
		{
			number= input.nextInt();
		}
		System.out.println("You entered "+number);
		int check=number;
		
		while(check>0){
			reverse=reverse*10+check%10;
			check=check/10;
		}
		
		if(number==reverse)
			System.out.println("The number is palyndrome");
		else
			System.out.println("The number is not Palyndrome");
	}

}
