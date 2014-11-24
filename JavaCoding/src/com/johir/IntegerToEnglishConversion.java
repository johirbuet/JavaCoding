/*
 * Md Johirul Islam; mislam@iastate.edu
 * This program will take integer number as input and give the output in english words.
 * like 10- ten
 * 100- one hundred etc
 */
package com.johir;

import java.util.Scanner;

public class IntegerToEnglishConversion {

	/**
	 * @param args
	 */
	static String [] num_to_text ={ "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
	static String [] tens_to_text={ "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };
	static String [] power_to_text={ "", "thousand", "million", "billion" };
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number: ");
		int input=sc.nextInt();
		System.out.println(translateMillions(input));

	}
	public static String translateNum(int num){ 
		if(num<20)
			return num_to_text[num];
		int tens=num/10;
		int units=num%10;
		return tens_to_text[tens]+" "+num_to_text[units];
	}
	public static String translateHundred(int num){
		if(num<100)
			return translateNum(num);
		int hundreds=num/100;
		int tenschunk=num%100;
		return num_to_text[hundreds]+" hundred "+translateNum(tenschunk);
	}
	public static String translateThousands(int num){
		if(num<1000)
			return translateHundred(num);
		int thousands=num/1000;
		int hundredchunk=num%1000;
		if(thousands<20)
		return num_to_text[thousands]+" thousand "+translateHundred(hundredchunk);
		else
		{
			return tens_to_text[thousands/10]+" "+ num_to_text[thousands%10]+" thousand "+translateHundred(hundredchunk);
		}
	}
	public static String translateLakhs(int num){
		if(num<100000)
			return translateThousands(num);
		int lakhs=num/100000;
		int thousandchunk=num%100000;
		return num_to_text[lakhs]+" lakh "+translateThousands(thousandchunk);
	}
	public static String translateMillions(int num){
		if(num<1000000)
			return translateLakhs(num);
		int millions=num/1000000;
		int lakhchunk=num%1000000;
		return num_to_text[millions]+" million "+translateLakhs(lakhchunk);
	}
	

}
