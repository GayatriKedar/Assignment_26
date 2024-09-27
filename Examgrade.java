package assignment_26;
import java.util.*;
public class Examgrade {

//Assignment 2: Exam Grading System
//Write a program that determines whether a student passes an exam based on three subjects. A student passes if the average score is at least 60, and none of the individual scores is below 40.
public static void main(String[] args)
{
     Scanner sc=new Scanner(System.in);
     
     int s1;
     int s2;
     int s3;
     double avg;
     System.out.println("Enter the three subject marks");
     
     s1=sc.nextInt();
     s2=sc.nextInt();
     s3=sc.nextInt();
     
     avg=(s1+s2+s3)/3;
     if(avg >=60 && s1>40 && s2>48 && s3>=40)
     { 
    	 System.out.println("Student is pass");
     }
     else
     {
    	 System.out.println("Student is failed");
     }
}

}

