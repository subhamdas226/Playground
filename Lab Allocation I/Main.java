import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill the code;
      Scanner sc= new Scanner(System.in);
		int L1= sc.nextInt();
		int L2= sc.nextInt();
      int L3= sc.nextInt();
      
      String lab = (L1 < L2)?(L1<L3? "L1":"L3") : (L2<L3?"L2":"L3");
      System.out.println(lab);
    }
}