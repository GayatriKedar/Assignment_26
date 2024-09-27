package assignment_26;
import java.util.*;
public class Logicalnot {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter number ");
		num=sc.nextInt();
		if(!(num>=10 && num<=20))
		{
			System.out.println("Number is not between range 10 to 20(Inclusive)");
		}
		else
		{
			System.out.println("Number is between 10 to 20");
		}

	}


}
