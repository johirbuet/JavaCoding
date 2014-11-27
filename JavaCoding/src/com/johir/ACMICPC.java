/*
 * This code solves the problem ACM ICPC TEAM from hackerrank
 * https://www.hackerrank.com/challenges/acm-icpc-team
 * mislam@iastate.edu;
 */
package com.johir;

import java.util.Scanner;

public class ACMICPC {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int count=0;
		int max=Integer.MIN_VALUE;
		int team=0;
		String[] arr=new String[N];
		for(int i=0;i<N;i++){
			arr[i]=sc.next();
		}
		for(int i=0;i<N-1;i++){
			for(int j=i+1;j<N;j++){
			count=getOne(arr[i], arr[j]);
			if(count>max)
			{
				max=count;
				team=0;
			}
			if(count==max)
				team++;
			}
		}
		System.out.println(max);
		System.out.println(team);
	}
public static int getOne(String a, String b){
		int count=0;
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)=='1'|| b.charAt(i)=='1')
				count++;
		}
		return count;
	}
}
