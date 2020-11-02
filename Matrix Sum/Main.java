// Sum for all elements in matrix
import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      Scanner sc= new Scanner(System.in);
		int row= sc.nextInt();
      int col= sc.nextInt();
      int [][]arr = new int[row][col];
      int sum=0;
      for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
      		arr[i][j]= sc.nextInt();
          sum = sum + arr[i][j];
        }
	}
      System.out.println(sum);
	}
}