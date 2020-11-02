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
      
      for(int i=0;i<row;i++){
        int max=0;
        for(int j=0;j<col;j++){
      		arr[i][j]= sc.nextInt();
          if(arr[i][j]>max){
          	max = arr[i][j];
          }
          if(j==col-1){
        	System.out.println(max);
        }
        }
        
	}
      
	}
}