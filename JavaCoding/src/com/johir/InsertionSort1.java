package com.johir;

import java.util.Scanner;

public class InsertionSort1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
         for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
         }
         insertIntoSorted(ar);

	}
    public static void insertIntoSorted(int[] ar) {
        // Fill up this function  
    	boolean isChanged=false;
    	//int key=ar[ar.length-1];
    	for(int i=ar.length-1;i>1;i--){
    		int key=ar[i];
    		int j=i-1;
    		for(isChanged=false;j>=0;j--){
    			if(ar[j]>key){
    				isChanged=true;
    				ar[j+1]=ar[j];
    				printArray(ar);
    			}
    			else
    				break;
    			ar[j+1]=key;
    			if(isChanged)
    				printArray(ar);
    		}
    	}
    }
    private static void printArray(int[] ar) {
        for(int n: ar){
           System.out.print(n+" ");
        }
          System.out.println("");
     }
	
	

}
