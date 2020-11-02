/*
Input (stdin)
6

Output (stdout)
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
16 17 18 19 20 21
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
      	for(int j=1;j<=i;j++){
          sum+=1;
        	System.out.print(sum+" ");
        }
        System.out.println("");
        
      }
	}
}