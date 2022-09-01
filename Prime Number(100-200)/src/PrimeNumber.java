// java program that find prime number between 100 to 200 number range.

import java.util.Scanner;          //importing 'util' package to use 'scanner' method

public class PrimeNumber                      //class name PrimeNumber
{

	public static void main(String[] args)       //main() class
	{
		Scanner sc=new Scanner(System.in);
		
		int i,flag=0;
		 
		
		//Asking user to enter a number b\w(100-200) to check if prime or not
		System.out.println("Enter a number between(100-200) range: ");
		int num=sc.nextInt();
		if(num>=100 && num<=200)         //checking is number is between given range(100-200)
		{
		for(i=2;i<num;i++) 
		{
		if(num%i==0)                 //checking if num divided by i gives remainder 0
		  {
			flag++;                  //if true increment flag value
			break;                   // break      
		 
		  }
	    
		}    //END-OF-FOR LOOP
		
		if(flag==0)                 //if flag value is equal to zero
		{
			System.out.println(num+" is a prime number");          //print prime number
		}
		else System.out.println(num+" is not  a prime number");    // otherwise print not a prime number
		} 
		
		//otherwise show warning that number is not in given range
		else System.out.println(" !! "+num +" is greater than given range !!");
	}   //ENF-OF-MAIN() class

}
