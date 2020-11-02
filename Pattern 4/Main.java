/*
Input (stdin)
6

Output (stdout)
666666
566666
456666
345666
234566
123456
*/
import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
     
      int temp=n;
      for(int i=1;i<=n;i++){
        int inc_temp = temp;
      	for(int j=1;j<=n;j++){
          System.out.print(inc_temp+"");
          if(inc_temp<n){
          	inc_temp++;
          }	
        }
        System.out.println("");
        temp--;
       // int inc_temp = temp;
      }
	}
}