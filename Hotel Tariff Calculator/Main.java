/*
Hotel Tariff Calculator
Write a program to calculate the hotel tariff. The room rent is 20% high during peak seasons [April-June, November-December].  Note: Use the switch construct.
Input format:

The first input containing an integer which denotes the number of the month

The second input containing the floating point number which denotes the room rent per day

The third input containing an integer which denotes the number of days stayed in the hotel



Output format:

Print the hotel tariff to be paid in floating point with 2 decimal places

Refer the sample output for formatting



Sample Input:

3

1500

2



Sample Output:

3000.00
*/
import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      Scanner sc= new Scanner(System.in);
		int month= sc.nextInt();
      	float rent = sc.nextFloat();
		int days= sc.nextInt();
      float tariff =0;
      switch(month){
        case 1:
          tariff = rent*days;
          System.out.println(tariff);
          break;
        case 2:
          tariff = rent*days;
          System.out.println(tariff);
          break;
         case 3:
           rent = rent +(rent*20)/100;
          tariff = rent*days;
          System.out.println(tariff);
          break;  
      	case 4:
           rent = rent +(rent*20)/100;
          tariff = rent*days;
          System.out.println(tariff);
          break;
      	case 5:
           rent = rent +(rent*20)/100;
          tariff = rent*days;
          System.out.println(tariff);
          break;
        case 6:
            tariff = rent*days;
            System.out.println(tariff);
            break;
      	case 7:
          tariff = rent*days;
          System.out.println(tariff);
          break;
      	case 8:
          tariff = rent*days;
          System.out.println(tariff);
          break;
      	case 9:
          tariff = rent*days;
          System.out.println(tariff);
          break;
      	case 10:
          tariff = rent*days;
          System.out.println(tariff);
          break;
      	case 11:
           rent = rent +(rent*20)/100;
          tariff = rent*days;
          System.out.println(tariff);
          break;
      	case 12:
          rent = rent +(rent*20)/100;
          tariff = rent*days;
          System.out.println(tariff);
          break;
      	default:
    		System.out.println("Invalid Input");
      }
      
      
	}
}