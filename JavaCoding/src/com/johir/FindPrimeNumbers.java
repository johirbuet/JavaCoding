/*
 * *
 * * Md Johirul Islam
 * * This code will find the prime numbers from 1 to 1000
 * *
 * *
 */

package com.johir;

public class FindPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=2;i<1000;i++){
			if(isPrime(i)){
				count++;
				System.out.println(i+" is Prime Number");
			}
		}
		System.out.println("Total Prime numbers Found is= "+count);

	}
	
	public static boolean isPrime(int n){
		if(n==1)
			return false;
		for(int i=2;i<=n/2;i++){
			if(n%i==0)
				return false;
		}
		return true;
	}

}
