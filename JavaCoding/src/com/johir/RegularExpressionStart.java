package com.johir;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionStart {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="This order was placed for QT3! OK?";
		String regex="(.*)(\\d+)(.*)";
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(input);
		if(m.find())
		{
			System.out.println("Total Groups= "+m.groupCount());
			System.out.println("Value="+m.group(0));
			System.out.println("Value="+m.group(1));
			System.out.println("Value="+m.group(2));
		}

	}

}
