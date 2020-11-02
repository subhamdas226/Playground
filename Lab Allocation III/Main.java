import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill the code;
      Scanner sc= new Scanner(System.in);
      int ar[] = new int[3];
		ar[0]= sc.nextInt();
		ar[1]= sc.nextInt();
      	ar[2]= sc.nextInt();
      	int n = sc.nextInt();
      int count=0;
      for(int i=0;i<ar.length;i++){
      	if(n<=ar[i]){
        	count++;
        }
      }
      System.out.println(count);
    }
}