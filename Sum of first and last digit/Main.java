import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int fd = n;
      while(fd>=10){
      	fd =  fd/10;
      }
      int ld ;
      ld = n%10;
      int sum = ld+fd;
      System.out.println(sum);
	}
}