import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
      int []arr = new int[n];
    int sum_even=0;
    int sum_odd = 0;
      for(int i=0;i<n;i++){
      	arr[i]= sc.nextInt();
        if(arr[i]%2==0){
        	sum_even = sum_even + arr[i];
        }
        else{
        	sum_odd = sum_odd + arr[i];
        }
      }
    System.out.println("The sum of the even numbers in the array is "+sum_even);
    System.out.println("The sum of the odd numbers in the array is "+sum_odd);
  }
}