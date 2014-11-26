package com.johir;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class FindMinUnfairness {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int K=sc.nextInt();
		int [] packets=new int[N];
		for(int i=0;i<N;i++)
			packets[i]=sc.nextInt();
			Arrays.sort(packets);
			System.out.println(getMinUnfairness(packets,K,N));
	}
	static int getMinUnfairness(int [] arr,int K,int N){
		int min=Integer.MAX_VALUE;
		for(int i=0;i+K-1<N;i++)
		{
			min=Math.min(min, arr[i+K-1]-arr[i]);
		}
		return min;
	}

}
