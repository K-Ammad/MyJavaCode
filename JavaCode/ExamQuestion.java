import java.util.*;
public class ExamQuestion 
{
  public static void main ( String[] args)
  {
   	int upperRange = 0 , lowerRange = 0, optionSelect = 0 , multiNum = 0 ;
   	boolean result = false;

	System.out.println("1. All Even number within Range");
	System.out.println("2. All Odd Numbers within Range"); 
	System.out.println("3. All Multiple number within Range");

	System.out.println("Please Select an option: ");
	Scanner sc = new Scanner(System.in);
	optionSelect = sc.nextInt();
       	
	System.out.println("Enter Lower Range");
	lowerRange = sc.nextInt();
	System.out.println("Enter Upper Range");
	upperRange = sc.nextInt();
	
	if (optionSelect == 1)
	{
	 System.out.print("All Even Numbers with in range are: ");	
	  for ( int i = lowerRange ; i <= upperRange ; i++)
	  {
		result = allEvenNumbersWithInRange(i);
      		if ( result == true)
		{ 
		    System.out.print(i + " ");
		}
	  }
	}

	else if (optionSelect == 2)
	{
	 System.out.print("All Odd Numbers with in range are: ");	
	  for ( int i = lowerRange ; i <= upperRange ; i++)
	  {
		result = allOddNumbersWithInRange(i);
      		if ( result == true)
		{ 
		    System.out.print(i + " ");
		}
	  }
	}			
	else  if (optionSelect == 3)
	{
	 System.out.println("Enter the Number who's multiple you want: ");
	 multiNum = sc.nextInt();
	 System.out.print("All multiple of " +multiNum+ " within range are : ");	
	  for ( int i = lowerRange ; i <= upperRange ; i++)
	  {
		result = allMultiplesWithInRange(i , multiNum);
      		if ( result == true)
		{ 
		    System.out.print(i + " ");
		}
	  }
	}
	else 
	{
		System.out.println("Please Enter either 1,2 or 3 ");
	}
  }
	private static  boolean allEvenNumbersWithInRange(int pA)
	{
	  boolean ans;
	  ans = (pA % 2 == 0);
	  return ans;
	}
	
	private static  boolean allOddNumbersWithInRange(int pB)
	{
	  boolean ans;
	  ans = (pB % 2 != 0);
	  return ans;
	}


	private static boolean allMultiplesWithInRange(int pC , int pD)
	{
	  boolean ans;
	  ans = (pC % pD == 0);
	  return ans;
	}


}
