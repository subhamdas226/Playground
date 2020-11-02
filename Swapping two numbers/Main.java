import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        // fill your code
       Scanner sc= new Scanner(System.in);
      int temp=0;
		int num1= sc.nextInt();
		int num2= sc.nextInt();
      num1 = num1+num2;
      num2 = num1-num2;
      num1 = num1-num2;
      System.out.println(num1);
      System.out.println(num2);
     
    }
}