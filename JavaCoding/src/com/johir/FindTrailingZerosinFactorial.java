package com.johir;

import java.math.BigInteger;

public class FindTrailingZerosinFactorial {

	/**
	 * @param args
	 */
	static BigInteger count=new BigInteger("0");
	static BigInteger count2=new BigInteger("0");
	static BigInteger count5=new BigInteger("0");
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("10!= "+factorial(5));
		//count+=count5;
		count=count.add(count5);
		System.out.println("Trailing zeros is= "+count);
	}
	
	public static BigInteger factorial(int n){
		if(n%10==0)
			count.add(new BigInteger("1"));
		else if(n%2==0)
			count2.add(new BigInteger("1"));
		else if (n%5==0)
			count5.add(new BigInteger("1"));
		else;
		
		if(n<=1)
			return new BigInteger("1");
		BigInteger n1=new BigInteger("n");
		return n1.multiply(factorial(n-1));
	}

}
