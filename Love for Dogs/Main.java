// import the respective packages
// declare the class/classes mentioned in the above statements by using default access modifiers
//Ex. If ProGrad is the class name, then declare it as class ProGrad{ } without any access modifier
import java.util.Scanner;
import java.util.*;
import java.util.regex.*;
//Main class to control all other classes
public class Main{
  public static void main(String[] args){
    //Try out your code here!...
    dog dg = new dog();
    dg.puppy();  
  }
}
class dog{
	String name, color, breed;
  	float weight;
  	int age;
  	public 	void puppy(){
      Scanner sc = new Scanner(System.in);	
      String name = sc.nextLine();
      float weight = sc.nextFloat();
      int age = sc.nextInt();
      sc.nextLine();
      String color = sc.nextLine();
      String breed = sc.nextLine();
      String str = "^[a-zA-Z ]*$";
      //String num = "^\\d*\\.?\\d*$";
      String ag = "^[0-9]*$";
      String num = "^[+]?[0-9]*\\.?[0-9]*$";
      String w=Float. toString(weight);
      String agg = Integer.toString(age);
      Matcher b = Pattern.compile(str).matcher(name);
      Matcher a = Pattern.compile(ag).matcher(agg);
      Matcher k = Pattern.compile(num).matcher(w);
      
      if( (age>0) && (weight>0) && (b.matches()) && (k.matches())
         && (a.matches()) ){
        System.out.println("Name of the dog: "+name);
        System.out.println("Weight of the dog: "+weight);
        System.out.println("Age of the dog: "+age);
        System.out.println("Color of the dog: "+color);
        System.out.println("Breed of the dog: "+breed);
      }
      else{
      	System.out.println("Invalid Input");
      }
    }
  }
