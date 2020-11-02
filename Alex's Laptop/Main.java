// import the respective packages
// declare the class/classes mentioned in the above statements by using default access modifiers
//Ex. If ProGrad is the class name, then declare it as class ProGrad{ } without any access modifier

//Main class to control all other classes
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    //Try out your code here!...
      String brandName, processorName, os;
  		long processorRange, ram;
    Laptop lp = new Laptop();
    lp.displayLaptopDetails();
    
  }
}
class Laptop{		
	
  public void displayLaptopDetails(){
  	Scanner sc =new Scanner(System.in);
    String brandName = sc.nextLine();
    String processorName = sc.nextLine();
    String os = sc.nextLine();
    int processorRange = sc.nextInt();
    int ram = sc.nextInt();
    if (ram>0 && processorRange>0){
      
        System.out.println("Laptop Details");
        System.out.println("Laptop Brand: "+brandName );
        System.out.println("Processor Name: "+processorName);
        System.out.println("OS: "+os);
        System.out.println("Processor Range: "+processorRange+" bit");
        System.out.println("Ram: "+ram+" GB");
     
    }
    else{
    System.out.println("Invalid Input");
    }
  }
}