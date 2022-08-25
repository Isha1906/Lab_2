//Program to find HCF of two numbers using Euclid formula

public class HCF {                 //class name HCF

	public static void main(String[] args) {       //main() class
		
		
		int val1=60,val2=36,hcf=0;              //initializing and declaring variables (val1,val2,hcf)
		                     
		
	    for(int i=1;i<=val1 || i<=val2;i++)      //using for loop
	    {
	    	
	    	if(val1%i==0 && val2%i==0 )         //Checking Using If Condition 
	    		
	    	{
	    		
	    		hcf=i;                         //check that it is divided by any natural number
	    		
	    	}
	    }
	    
	    
	       System.out.println("The HCF of 60 and 36 is: " +hcf);           //printing HCF 

	}

}
