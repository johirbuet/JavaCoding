/*
 * Md Johirul Islam; mislam@iastate.edu
 * This code will use recursion to determine the factorial of a number
 */
package com.johir;

public class RecursionExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("5!= "+recursiveFactorial(5));

	}
	public static int recursiveFactorial(int n){
		if(n<=1)
			return 1;
		else
			return n*recursiveFactorial(n-1);
	}
	

}
