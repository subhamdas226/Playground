import java.util.Scanner;
import java.util.Arrays;
class Main
{
    public static void main(String args[])
    {
        //fill the code;
      Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
      int []arr = new int[n];
      for(int i=0;i<n;i++){
      	arr[i]= sc.nextInt();
      }
      Arrays.sort(arr);
         System.out.println(arr[arr.length-1]+" is the maximum element in the array");
    }
}