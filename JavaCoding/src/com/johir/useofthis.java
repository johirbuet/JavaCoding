package com.johir;

public class useofthis {
	static int id,age;
	static String name;
	public useofthis(int id,String name){
		this.id=id;
		this.name=name;		
	}
	public useofthis(int id,String name,int age){
		this(id,name);
		this.age=age;
	}
	public static void display(){
		System.out.println("Name is "+name+ ", Age= "+age+" ID is "+id);
	}
	public static void main(String[] args) {
		useofthis obj=new useofthis(101, "Johir", 25);
		obj.display();
	}

}
