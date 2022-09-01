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
		  System.out.println("Amount has been deposited and now balance is : "+bal);
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
		CurrentAc c=new CurrentAc();              //created object for CurrentAc class
		SavingAc s=new SavingAc();                //created object for SavingAc class
		int ch;
		String sa;
		System.out.print("PRESS 1 FOR (Current Account) and PRESS 2 FOR (Saving Account) :");
		ch=sc.nextInt();                           //asking user to enter choice to use current or saving account
		
		
		if(ch==1)                   //checking user's choice
		{
		  
		         System.out.println("---Current Account---");
		   
		         System.out.println("What would you like to do....?");       //asking user to choice what he/she would like to do
		   
		         System.out.println("a. Check Balance-");
		   
		         System.out.println("b. Deposit Amount");
		   
		         System.out.println("c. Withdraw Amount");
		   
		         System.out.println("PRESS a , b or c");
		   
	              sa=sc.next();
		   
		switch(sa)
		{
		case "a": c.getBalance();
		           break;                                      
		      
		        
		case "b" :c.depositeAmount();
                   break;
                
		case "c":  c.widrawAmount();
			        break;
			
			
			
			
        }     //ENF_OF_INNER_SWITCH
		
		}
		else
		{
		
		  System.out.println("---Saving Account---");
		   
        System.out.println("What would you like to do....?");
  
        System.out.println("a. Check Balance-");
  
        System.out.println("b. Deposit Amount");
  
        System.out.println("c. Withdraw Amount");
  
        System.out.println("PRESS a , b or c");
  
        sa=sc.next();
  
        switch(sa)
      {
          case "a": s.getBalance();
          break;                                       //choice 1 for Current Account
     
       
          case "b" :s.depositeAmount();
          break;
       
          case "c":  s.widrawAmount();
	        break;
	
          	
	
	  }          //ENF_OF_INNER_SWITCH
       
		
		}         //ENF_OF_ELSE
	}
}           //END_OF_PROGRAM
