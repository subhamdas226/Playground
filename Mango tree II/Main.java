/*
Mango tree II
Sara is interested so much in gardening and she plants more trees in her garden. 
She plants trees in a rectangular fashion with the order of rows and columns. 
She numbered the trees in column wise order and planted mango tree only in a 1st row, 1st column and last column.
So given the tree number, write a program to find whether the given tree is a mango tree or not?
Input format:

Input consists of 3 integers

The first input denotes the number of rows

The second input denotes the number of columns

The third input denotes the tree number



Output format:

If the given number is a mango tree, print "Yes". Otherwise, print "No"

Refer the sample output for formatting



Sample Input:

5

5

15



Sample Output:

No

3
5
7

Output (stdout)
yes
*/

  
import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      Scanner sc= new Scanner(System.in);
		int row= sc.nextInt();
		int col = sc.nextInt();
      int n = sc.nextInt();
      int tree_row=0;
      int tree_col = 0;
      if(n%row == 0){
      	tree_row = row;
      }
      else{
      	tree_row = n%row;
      }
      if(n<row){
        tree_col=1;
      }
      else{  
          //tree_col = n/row;
          if(n%row==0){
			tree_col = n/row;
          }
        else{
        	tree_col = (n/row)+1;
        	}
        
        }
      
      if(tree_col == 1 || tree_col==col){
      	System.out.println("yes");
      }
      else if(tree_row == 1){
      	System.out.println("yes");
      }
      else {
      	System.out.println("No");
      }
	}
}