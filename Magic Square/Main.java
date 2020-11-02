import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
      Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		// fill your code
      int [][]arr = new int[n][n];
      int []c_arr = new int[n];
      int []r_arr = new int[n];
      
      for(int i=0;i<n;i++){
      	for(int j=0;j<n;j++){
        	arr[i][j]= sc.nextInt();
        }
      }
      int d_sum =0;
      int d2_sum =0;
      for(int i=0;i<n;i++){
        int c_sum = 0;
        int r_sum = 0;
        for(int j=0;j<n;j++){
      		
          c_sum = c_sum + arr[i][j];
          r_sum = r_sum + arr[j][i];
          
          if(i==j){
          	d_sum = d_sum + arr[i][j];
          }
          if((i+j) == (n-1)){
          	d2_sum = d2_sum + arr[i][j];
          }
          
        }
        c_arr[i] = c_sum;
        r_arr[i] = r_sum;
	}
      int diag=0,row_chk=0,col_chk=0;
      if(d2_sum == d_sum){
      	diag =1;
      }
      else{
      	System.out.println("no");
        //break;
      }
      int ro_col = 0;
      for(int k=0;k<c_arr.length;k++){
      	if(c_arr[k]==r_arr[k]){
        	ro_col = 1;
        }
        else{
          System.out.println("no");
        	break;
        }
      	if(c_arr.length-1 !=k){
        	  if(c_arr[k]==c_arr[k+1]){
        	col_chk =1;
        }
        else{
        	 System.out.println("no");
        	break;
        }
        }
        if(c_arr.length-1 !=k){
        	  if(r_arr[k]==r_arr[k+1]){
        	row_chk =1;
        }
        else{
        	 System.out.println("no");
        	break;
        }
        }
      }
      if(row_chk==col_chk){
      	if(diag==ro_col && diag==row_chk){
        	System.out.println("yes");
        }
      }
	}
}