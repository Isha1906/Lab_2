//Program to print transpose of matrix and multiplying all elements of matrix

public class TransposeAndMulti          //class name TransposeAndMulti 
{

	public static void main(String[] args)       //main() class
	{
		
		//Initializing and declaring integer 2-D array of name matrix
	   int[][] matrix= {{1,2},{4,5},{8,9}};
	   
	   //Initializing integer 2-D array of name trans
	   int[][] trans=new int[2][3]; 
	   
		int pro=1;           //Initializing variable pro with value 1
		
		for(int i=0;i<2;i++)             //Using For loop 
		{
				for(int j=0;j<3;j++)
				{
					
					trans[i][j]=matrix[j][i];    //Transposing matrix value and saving into trans matrix
				
				}
			
		}
		
		System.out.println("The transpose of the Original matrix is: ");
			
			for(int i=0;i<2;i++) 
			{
				for(int j=0;j<3;j++)
				{
					System.out.print(trans[i][j]+" ");  //print matrix after transpose
				}
				
				System.out.println();
			}
	          
			
		
			for(int i=0;i<3;i++)          //Product of all elements of matrix
			{
				for(int j=0;j<2;j++)
				{
					
				 pro=pro*matrix[i][j];    //Multiply  all the matrix member using loops 
				
				}
				
			}
			System.out.println("Product of matrix element is: "+pro);

}
	}
