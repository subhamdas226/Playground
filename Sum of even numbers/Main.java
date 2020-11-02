import java.util.*;
class Main
{
  public static void main(String args[])
  {
    // type your code here
    Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
      int []arr = new int[n];
    int sum=0;
      for(int i=0;i<n;i++){
      	arr[i]= sc.nextInt();
        if(arr[i]%2==0){
        	sum = sum + arr[i];
        }
      }
    System.out.println("The sum of the even numbers in the array is "+sum);
  }
}