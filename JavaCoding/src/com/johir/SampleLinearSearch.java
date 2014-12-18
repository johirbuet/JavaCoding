package com.johir;

import java.util.Scanner;

public class SampleLinearSearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int V=sc.nextInt();
		int n=sc.nextInt();
		int temp=n;
		int [] ar=new int[n];
		for(int i=0;i<n;i++){
			ar[i]=sc.nextInt();
		}
		while(--temp>=0){
			if(ar[temp]==V)
				System.out.println(temp);
		}

	}

}
