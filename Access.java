package assignment_26;
import java.util.*;
public class Access {
	
         public static void main(String[] args) 
         {

			Scanner door=new Scanner(System.in);

			boolean validId;

			boolean validAccess;

			boolean admin;

			System.out.println("Please identify Yourself with Valid Id");

			validId=door.nextBoolean();

			System.out.println("Please Give Valid Access card");

			validAccess=door.nextBoolean();

			System.out.println("Please Swap Valid Admin access card");

			admin=door.nextBoolean();

			if(validId==true && validAccess==true || admin==true)

			{

				System.out.println("Door has been Unlocked Successfully");

			}	

			else
           {

				System.out.println("Access Denied");
			}
		}
	}

