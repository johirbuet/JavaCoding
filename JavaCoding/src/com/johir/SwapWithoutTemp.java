/*
 * Md Johirul Islam; mislam@iastate.edu
 */
package com.johir;

public class SwapWithoutTemp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20,b=50;
		System.out.println("Before Swapping a= "+a+ " b="+b);
		swap(a, b);
		

	}
	
	public static void swap(int num1,int num2){
		num1=num1*num2;
		num2=num1/num2;
		num1=num1/num2;
		System.out.println("After Swapping a= "+num1+" b="+num2);
	}
	
}
