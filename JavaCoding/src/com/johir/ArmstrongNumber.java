/*/
*
* Md Johirul Islam; mislam@iastate.edu
* This code will find armstrong Numbers from 1 to 1000
*
*
*/
package com.johir;


public class ArmstrongNumber {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<1000;i++)
		{
			if(isArmstrong(i)){
				System.out.println(i+" is armstrong Number");
			}
		}

	}
	
	public static boolean isArmstrong(int n){
		int d1=n%10;
		int d2=(n/10)%10;
		int d3=(n/100);
		return n==(d1*d1*d1+d2*d2*d2+d3*d3*d3);
	}

}
