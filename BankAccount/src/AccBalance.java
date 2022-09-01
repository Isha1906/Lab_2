import java.util.Scanner;

/*Program to create class Account with subclasses CurrentAc and SavingaAc
 *  with three methods getBalance,depositeAmount,WidrawAmount
 *  Savings account has no transaction fee but current account has transaction fee of rs.10
 */

abstract class Account                    //abstract class Account(Parent class)
{
	public abstract void getBalance ();       //abstract methods
	public abstract void depositeAmount();
	public abstract void widrawAmount();
	
}
 class CurrentAc extends Account          //class subclass-CurrentAc 
{
    static int bal = 1000;
    
	public void getBalance()              //abstract method body
	{
	System.out.println("YOUR BALANCE IS: "+bal);        //printing Initial Balance
		
	}
	
	public void depositeAmount()               //abstract method body
	{ 
		Scanner sc=new Scanner(System.in);
	  System.out.print("Enter Amount to deposit : ");     //depositing amount in account
	  int depo_amt=sc.nextInt();
	  bal=bal+depo_amt;
	  
	  if(bal>1000)
	  {                                               //charging transaction fee
		  bal=bal-10;
		  System.out.println("Transaction fee is deducted Rs.10");
		  System.out.println("Amount has been deposited and now balance is : "+bal);
	  }
	  
	}
	public void widrawAmount()                // //abstract method body
	{    
		Scanner sc=new Scanner(System.in);
		 System.out.print("Enter Amount to withdraw : ");    //withdrawing amount from account
		 int widraw_amt=sc.nextInt();
		 bal=bal-widraw_amt ;
		 
		 if(bal<=bal)
		  {                                           //charging transaction fee
			
			  bal=bal-10;
			  System.out.println("Transaction fee is deducted Rs.10");
			  System.out.println("Amount has been withdrawed and now balance is : "+bal);
		  }
	}

}	
 class SavingAc extends Account
 { 
	 static int bal = 1000;
	 
	    
	    
		public void getBalance()                //abstract method body
		{
		System.out.println("YOUR BALANCE IS: "+bal);
			
		}
		
		public void depositeAmount()              //abstract method body
		{ 
			Scanner sc=new Scanner(System.in);
		  System.out.print("Enter Amount to deposit : ");      //depositing amount in account
		  int depo_amt=sc.nextInt();
		  bal=bal+depo_amt;
		 } 
		
		public void widrawAmount()              //abstract method body
		{    
			Scanner sc=new Scanner(System.in);
			 System.out.print(" Enter Amount to Withdraw : ");          //withdrawing amount from account
			 int widraw_amt=sc.nextInt();
			 bal=bal-widraw_amt ;
			 System.out.println("Amount has been withdrawed and now balance is : "+bal);
			  
		}

 }
	
public class AccBalance {              //class name AccBalance

	public static void main(String[] args)      //main() class
	{    
		Scanner sc=new Scanner(System.in);
		Account a=new CurrentAc();              //created object for Account class
		int ch;
		
		System.out.print("PRESS 1 FOR (Current Account) and PRESS 2 FOR (Saving Account) :");
		ch=sc.nextInt();                     //asking user to enter choice to use current or saving account
		switch(ch)
		{
		case 1: System.out.println("---Current Account---");
		                                                  //choice 1 for Current Account
		      
		        a.getBalance();
                a.depositeAmount();
                a.widrawAmount();
                
                break;
		case 2:  System.out.println("---Saving Account---"); 
		            a.getBalance();                        //choice 2 for Saving Account
                    a.depositeAmount();
                    a.widrawAmount();
                    
                    break;
                    
        default:   System.out.print("---!!! Entered Wrong Choice---");            
		}     //ENF_OF_SWITCH
	}

}           //END_OF_PROGRAM
