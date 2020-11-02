/*
Input (stdin)
7

Output (stdout)
1
1 0
1 0 1
1 0 1 0
1 0 1 0 1
1 0 1 0 1 0
1 0 1 0 1 0 1
*/
import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
       Scanner sc= new Scanner(System.in);
	  int n= sc.nextInt();
      
      for(int i=1;i<=n;i++){
        int value=1;
      	for(int j=1;j<=i;j++){
          //sum+=1;
        	System.out.print(value+" ");
          if(value==1){
          	value = 0;
          }
          else{
          	value = 1;
          }
        }
        System.out.println("");
        
      }
	}
}