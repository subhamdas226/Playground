/*
Mango tree I
Dora is interested so much in gardening and she plants more trees in her garden. She plants trees in a rectangular fashion with the order of rows and columns and numbered the trees in row-wise order. She planted the mango tree only in a 1st row, 1st column and last column. So given the tree number, your task is to find whether the given tree is a mango tree or not? Write a program to check whether the given number is a mango tree or not.
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

11



Sample Output:

Yes

Input (stdin)
5
5
14

Output (stdout)
No

Input (stdin)
10
60
2

Output (stdout)
Yes
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
      if(n%col == 0){
      	tree_col = col;
      }
      else{
      	tree_col = n%col;
      }
      if(n<col){
        tree_row=1;
      }
      else{  
       // tree_row = n/col; 
        if(n%col==0){
			tree_row = n/col;
          }
        else{
        	tree_row = n/col+1;
        	}
      }
      
      if(tree_col == 1 || tree_col==col){
      	System.out.println("Yes");
      }
      else if(tree_row == 1){
        
      	System.out.println("Yes");
      }
      else {
      	System.out.println("No");
      }
	}
}