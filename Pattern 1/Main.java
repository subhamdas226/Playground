import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
      int l=n;
      for(int i=1;i<=l;i++){
      	for(int j=1;j<=2*n-1;j++){
        	System.out.print(j+" ");
        }
        System.out.println("");
        n--;
      }
	}
}