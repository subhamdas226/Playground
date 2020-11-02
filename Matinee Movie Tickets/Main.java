import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      Scanner sc= new Scanner(System.in);
		int age= sc.nextInt();
      float time = sc.nextFloat();
      
   
      if( (time==(float)13.30) || time==18 || time==22){
      	if(age>=13){
        	System.out.println("$5.00");
        }
        else{
        	System.out.println("$2.00");
        }
      }
      else{
      	if(age>=13){
        	System.out.println("$8.00");
        }
        else{
        	System.out.println("$4.00");
        }
      }
      
	}
}