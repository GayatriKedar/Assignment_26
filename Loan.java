package assignment_26;
import java.util.*;
//Assignment 1: Validating Age and Income
//Write a program that checks if a person is eligible for a loan based on their age and income.
public class Loan {

	public static void main(String[] args)
	{
	int age=25;
	int income=30000;
	
	if((age >= 18 && age <= 60) && income > 20000)
	{
		System.out.println("Persong eligible for loan");
	}
	}
}
