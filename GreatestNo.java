package assignment_26;
import java.util.*;
public class GreatestNo {


	public static void main(String[] args) 
	{
		Scanner obj=new Scanner(System.in);
		int num1;
		int num2;
		int num3;
		int c;
		System.out.println("Enter 3 numbers ");
		num1=obj.nextInt();
		num2=obj.nextInt();
		num3=obj.nextInt();
		c=(num1 > num2) ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);
		System.out.println("Greatest no is "+c);
		
		
	}


	
}
