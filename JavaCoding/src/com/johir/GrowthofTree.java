package com.johir;

import java.util.Scanner;

public class GrowthofTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int iter=sc.nextInt();
		for(int i=0;i<iter;i++){
			int len=1;
			int cycles=sc.nextInt();
			for(int k=0;k<cycles/2;k++){
				len=len*2+1;
			}
			if(cycles%2!=0)
				len=len*2;
			System.out.println(len);
		}


	}

}
