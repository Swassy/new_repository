package com.mkyong.customer.model;
 
import java.sql.Timestamp;
 
public class Customer 
{
	private int custId;
	private String name;
	private int age;
	public Customer(int custId, String name, int age) {
		this.custId=custId;
		this.age=age;
		this.name=name;
		System.out.println("Customer id :"+custId+"\nName\t:"+name+"\nAge\t:"+age);
	}
	//getter and setter methods
	public void setCustId(int custId){
		this.custId=custId;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setAge(int age){
		this.age=age;
	}
	public int getCustId(){
		return custId;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
}