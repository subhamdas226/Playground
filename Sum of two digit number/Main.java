import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
   Scanner sc= new Scanner(System.in);
		int num1= sc.nextInt();
    int sum=0;
		
		while(num1>0){
			sum = sum + (num1 %10);
			num1 = num1/10;
          
		}
		System.out.println(sum);
  }
}