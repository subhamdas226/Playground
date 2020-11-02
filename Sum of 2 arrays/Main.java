import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill the code;
      Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
      int []raju = new int[n];
      int []ramu = new int[n];
      int []ragul = new int[n];
      for(int i=0;i<n;i++){
      	ramu[i]= sc.nextInt();
        //raju[i]= sc.nextInt();
      }
      for(int i=0;i<n;i++){
      	//ramu[i]= sc.nextInt();
        raju[i]= sc.nextInt();
      }
      for(int i=0;i<n;i++){
      	ragul[i] = ramu[i]+raju[i];
      }
      for(int i=0;i<n;i++){
      	//ragul[i] = ramu[i]+raju[i];
        System.out.println(ragul[i]);
      }
    }
}