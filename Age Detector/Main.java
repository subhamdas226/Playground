import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill the code;
      Scanner sc= new Scanner(System.in);
		int birth_year= sc.nextInt();
      
      int current_year = sc.nextInt();
      if(birth_year > current_year){
        birth_year = 1900 + birth_year;
        current_year = 2000+current_year;
        int current_age = current_year - birth_year;
      	System.out.println(current_age);
      }
      else {
      	int current_age = current_year - birth_year;
        System.out.println(current_age);
      }
    }
}