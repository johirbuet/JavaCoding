/*
 * mislam@iastate.edu
 * This code will find the the total digits of a number that divide the number
 * e.g. 102 : here both 1 and 2 divides the number. So the total no of perfect divisor
 *  digits is 2
 */
package com.johir;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindTotalDigitsThatDivideTheNumber {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number:");
		String input=br.readLine();
		int num=Integer.parseInt(input);
		System.out.println("Count is= "+getCounter(num));
	}
	static int getCounter(int num){
		char [] arr=String.valueOf(num).toCharArray();
		int count=0;
		for(int i=0;i<arr.length;i++){
			if(Character.getNumericValue(arr[i])!=0){
				if(num%Character.getNumericValue(arr[i])==0)
				count++;
			}
		}
		return count;
	}

}
