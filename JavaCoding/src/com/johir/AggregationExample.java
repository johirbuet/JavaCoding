package com.johir;

public class AggregationExample {

	/**
	 * @param args
	 */
	Address address;
	String name;
	public AggregationExample(String name,Address address){
		this.name=name;
		this.address=address;
	}
	void display(){  
		System.out.println(name);  
		System.out.println(address.city+" "+address.state+" "+address.country);  
		} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address addr=new Address(50014, "Ames", "Iowa", "USA");
		AggregationExample aggr=new AggregationExample("Johir", addr);
		aggr.display();

	}

}

class Address{
	int zip;
	String city,state,country;
	public Address(int zip,String city,String state,String country){
		this.city=city;
		this.country=country;
		this.state=state;
		this.zip=zip;
	}
}