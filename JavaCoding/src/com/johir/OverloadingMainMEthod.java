package com.johir;

public class OverloadingMainMEthod {

	/**
	 * @param args
	 */
	public static void main(int a,int b){
		System.out.println("Result from MAin method is="+(a+b));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Calling main() method");
		main(5,10);

	}

}
