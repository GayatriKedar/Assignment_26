package assignment_26;
import java.util.*;
public class Voting {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	
		int age;
		boolean isCitizen;
		System.out.println("Enter your Age");
		age=sc.nextInt();
		System.out.println("are you citizen");
		isCitizen=sc.nextBoolean();
		if(age>=18 && isCitizen==true)
		{
			System.out.println("Person is eligible for vote");
		}
		else
		{
			System.out.println("Not eligible for vote");
		}
	}
}
