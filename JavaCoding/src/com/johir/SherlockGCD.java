package com.johir;

import java.util.Scanner;

public class SherlockGCD {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0){
			int N=sc.nextInt();
			int [] input=new int[N];
			for(int i=0;i<N;i++){
				input[i]=sc.nextInt();
			}
			if(checkArray(input))
				System.out.println("YES");
			else
				System.out.println("NO");
		}

	}
	public static boolean checkArray(int[] arr){
		boolean check=false;
		int gcd=arr[0];
		for(int i=0;i<arr.length-1;i++){
			gcd=gcdr(gcd,arr[i]);
			System.out.println(gcd);
		}	
		if(gcd==1)
			check=true;
		System.out.println("GCD "+ gcd);
		return check;
	}
	public static int gcdr ( int a, int b )
	{
	  if ( a==0 ) return b;
	  return gcdr ( b%a, a );
	}

}
