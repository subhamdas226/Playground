import java.util.Scanner;
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
      int search = sc.nextInt();
      int flag=0;
      for(int i=0;i<n;i++){
      	if(search==arr[i]){
        	 System.out.println(search+" is present in the array");
          	 flag=1;
          	 break;
        }
      }
      if(flag==0){
      	System.out.println(search+" is not present in the array");
      }
    }
}