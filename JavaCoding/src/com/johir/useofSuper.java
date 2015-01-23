package com.johir;

public class useofSuper extends Parent {

	/**
	 * @param args
	 */
	public void display(){
		super.message();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		useofSuper obj=new useofSuper();
		obj.display();
	}

}

class Parent{
	public Parent(){
		System.out.println("Welcome Johir");
	}
	public void message(){
		System.out.println("Here is the message");
	}
}