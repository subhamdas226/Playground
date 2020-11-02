
//Maximum Element In Each Column
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
      //int max_ele_arr[] = new int[col];
      for(int i=0; i<row; i++)
			{
				for(int j=0; j<col; j++)
					arr[i][j] = sc.nextInt();
			}
      
      for(int i=0;i<col;i++){ // i will run upto column size
        int max=0;
        for(int j=0;j<row;j++){
      		//arr[j][i]= sc.nextInt();
          if(arr[j][i]>max){ //increments row-wise first
          	max = arr[j][i];
            
          }
        /*  if(j==row-1){
        	System.out.println(max);
        }*/
        }
        System.out.println(max);
       //max_ele_arr[i] = max;
	}
   /*  int len = max_ele_arr.length;
      for(int i=0;i<len;i++){
      	System.out.println(max_ele_arr[len-1-i]);
      }
      for(int i=0;i<col;i++){
        
        for(int j=0;j<1;j++){
      	
            System.out.println(arr[i][j]);
          }} */
	}
}