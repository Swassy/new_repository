package com.mkyong.common;
 
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.mkyong.customer.dao.CustomerDAO;
import com.mkyong.customer.model.Customer;
import java.util.Scanner;
import java.util.Random;
 
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = 
    		new ClassPathXmlApplicationContext("Spring-Module.xml");
    	Scanner sc=new Scanner(System.in);
    	System.out.print("Enter name:");
    	String name=sc.nextLine();
    	System.out.print("Enter age:");
    	int age=sc.nextInt();
        CustomerDAO customerDAO = (CustomerDAO) context.getBean("customerDAO");
        Customer customer = new Customer(((new Random()).nextInt(1500)), name,age);
        customerDAO.insert(customer);
 
        Customer customer1 = customerDAO.findByCustomerId(1);
        
        
        System.out.println(customer1);
        
 
    }
}