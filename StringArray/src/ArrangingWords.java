/*Program to print String element in ascending order according to their length
" this  is  a  easiest  example"   to   "a  is  this  easiest  example"
*/
public class ArrangingWords {

	public static void main(String[] args) {
     
		String stmt= "this is a easiest example";      //Initializes and declared String variable with name "stmt(statement)"
        
		String[] arr1=stmt.split(" ");              //Initializing String array arr1 to store the value of stmt after split
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=i+1;j<arr1.length;j++)
			{
			  if(arr1[i].length()>arr1[j].length())     //Checking and comparing array values
			  {
				  String temp_val=arr1[i];             //Initializing temp_val and storing arr1[i] value
				  
				  arr1[i]=arr1[j];                      //storing arr1[j] value to arr[i]
				  
				  arr1[j]=temp_val;                     //storing temp_val value to arr1[i] 
			 
			  }      //END-IF
			  
			}       //END-INNER FOR LOOP
			
		}          //END-OUTER FOR LOOP 
		
		for(int i=0;i<arr1.length;i++)                //Using for loop to print array elements
		{
			System.out.print(arr1[i]+"  ");           //Printing elements in ascending order acc.to length
		}

	}

}
