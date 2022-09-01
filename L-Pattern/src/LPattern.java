// java program  to draw 'L' pattern

public class LPattern            //class name LPattern
{

	public static void main(String[] args)      //main() class
	{
		int i,j,height=5;         
		 
		for(i=1;i<=height;i++)         //Outer for loop
		{
			System.out.println("*");     //Printing first column
			
			for(j=1;j<=height;j++)    //Inner For Loop
			{
			 if(i==height-1)	      //checking if i less than 4 
			 {
				 System.out.printf("* ");    //Printing last row 
			 
			 }//END-OF-IF
			
			}  
			
		}

	}   //END-OF-MAIN() CLASS

}  //END-OF-PROGRAM
