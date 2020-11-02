/*
Profit or loss
A fruit seller buys a dozen of banana at Rs.X. He sells 1 banana at Rs.Y. Write a program to determine the profit or loss in Rs. for the fruit seller..

Input format:

Input consists of 2 floating point numbers

The first input corresponds to the total cost(X)

The second input corresponds to the sold cost(Y)



Output format:

Print "Profit or Loss" with Rupees.



Sample Input:

60

4



Sample Output:

Loss : Rs.12.00
*/
import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill your code;
      Scanner sc= new Scanner(System.in);
		float CP = sc.nextFloat();
		float scost= sc.nextFloat();
      float SP = scost*12;
      
      
      if(CP<SP){
        float profit = SP - CP;
        System.out.printf("Profit : Rs.%.2f", profit);
      }
      else if(CP>SP){
        float loss = CP - SP;
      	//System.out.println("Loss : Rs."+loss);
        System.out.printf("Loss : Rs.%.2f", loss);
      }
      else{
      	System.out.println("No profit nor loss");
      }
    }
}