/*
Input (stdin)
5
Output (stdout)
1
1 2 3
1 2 3 4 5
1 2 3 4 5 6 7
1 2 3 4 5 6 7 8 9
*/
import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
       Scanner sc= new Scanner(System.in);
	  int n= sc.nextInt();
      int sum=0;
      for(int i=1;i<=n;i++){
      	for(int j=1;j<=2*i-1;j++){
          //sum+=1;
        	System.out.print(j+" ");
        }
        System.out.println("");
        
      }
	}
}