import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   //Type your code here
    Scanner in = new Scanner(System.in);
    int number= in.nextInt();
    for(int star_count=1;star_count<=number;star_count++)
      System.out.println("*");
  }
}