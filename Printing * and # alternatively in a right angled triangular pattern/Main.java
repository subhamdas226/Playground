import java.util.Scanner;
class Main
{
public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
  int star =1, has=1;
		for(int cur_row =1; cur_row <= n; cur_row++) {
			for(int cur_col=1; cur_col <= cur_row ; cur_col++) {
               
                if (star<=has) { 
                        System.out.print("*"); 
              			star++;
                }
                else{
                     System.out.print("#");
                	  has++;
                }
			}
		System.out.print("\n");
		}
	}
}