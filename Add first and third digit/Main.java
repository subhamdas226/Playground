import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
		Scanner sc= new Scanner(System.in);
		int num1= sc.nextInt();
		//int num2= sc.nextInt();
		int temp[]=new int[5];
		int i=0;
		while(num1>0){
			temp[i] = num1 %10;
			num1 = num1/10;
          i++;
		}
		System.out.println(temp[0]+temp[2]);
	}
}