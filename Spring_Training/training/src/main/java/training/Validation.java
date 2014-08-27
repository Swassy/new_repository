package training;

import java.util.Scanner;
import org.apache.commons.validator.routines.EmailValidator;


public class Validation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmailValidator ev = EmailValidator.getInstance();
		System.out.print("Enter e-mail-id :");String n=sc.nextLine();
		
		boolean b=ev.isValid(n);
		if(b)
			System.out.println("Valid");
		else
			{System.out.println("Invalid");}
		/*String sa=(n.split("@")[1]);
		System.out.println(sa);
		String sb[]=sa.split("\\.");
		for(int i=0;i<sb.length;i++)
			System.out.println("here"+sb[i]);*/
		sc.close();
	}
	public static int hasAdd(String n)
	{
		for(int i=0;i<n.length();i++)
		{
			char c=n.charAt(i);
			if(c=='@')
				return 1;
		}
		return 0;
	}
	public static int hasInvalidUserName(String n)
	{
		String userName=((n.split("@")[0]).toUpperCase());
		for(int i=0;i<userName.length();i++){
			char c=userName.charAt(i);
			if((c>'Z' || c<'A') & ((c!='.') || (c!='_')))
				return 1;
		}
		return 0;
	}
	public static int hasInvalidLast(String n){
		String add=(((n.split("@")[1]).split("\\.")[1]).toUpperCase());
		if(add.length()==4)
			return 0;
		else 
			return 1;
	}
	/*public int testFunc(String n)
	{
		return hasAdd(n);
	}
	public int testAtTheRate(String n){
		return hasAdd(n);
	}
	public int testInvalidUserName(String n){
		return hasInvalidUserName(n);
	}
	public int testInvalidLast(String n){
		return addInvalidLast(n);
	}*/
}
