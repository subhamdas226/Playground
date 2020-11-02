
/*
Sample Input:

5



Sample Output:

1 3 5 7 9

3 5 7 9

5 7 9

7 9

9
*/
import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
        int l=n;
      int ov=1;
      for(int i=1;i<=l;i++){
        
        int value = ov;
      	for(int j=1;j<=n;j++){
          
        	System.out.print(value+" ");
          value+=2;
        }
        System.out.println("");
        ov+=2;
        n--;     }
	}
}