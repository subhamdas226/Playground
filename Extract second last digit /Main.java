import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner sc= new Scanner(System.in);
		int num1= sc.nextInt();
      int temp=0;
		int i=1;
		while(i<3){
			temp = num1 %10;
			num1 = num1/10;
          i++;
		}
     
		System.out.println(temp);
	}
}