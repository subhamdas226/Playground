/*
Traffic Signal
We are driving down the street and see a green traffic light ahead. Because we know precisely the pattern of this traffic light, we know exactly how long we have before it will turn red. We wish to compute whether we will pass the traffic light before it turns red at our current speed. Write a program to check whether we will beat the light or not with the current speed.
Input format:

The first input containing the floating point number which denotes the current speed in miles per hour

The second input containing the floating point number which denotes the distance to the light in miles 

The third input containing the floating point number which denotes the time until it turns red in seconds



Output format:

Print "Yes", if we will be able to beat the light at current speed. 

Print "No", if we won't be able to beat light at current speed.



Sample Input:

59.99

1

60



Sample Output:

No
*/
import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      Scanner sc= new Scanner(System.in);
		float speed = sc.nextFloat();
		float distance = sc.nextFloat();
      	int time = sc.nextInt();
      
      float remained_dist = speed/time;
      if(remained_dist >= distance){
        System.out.println("Yes");
      }
      else{
      	System.out.println("No");
      }
	}
}