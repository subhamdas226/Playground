// import the respective packages
// declare the class/classes mentioned in the above statements by using default access modifiers
//Ex. If ProGrad is the class name, then declare it as class ProGrad{ } without any access modifier
//Main class to control all other classes

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main{
  public static void main(String[] args){
    //Try out your code here!...
    Scanner sc =new Scanner(System.in);
    String friend = sc.nextLine();
    String gender = sc.nextLine();
    int age = sc.nextInt();
    	
    Friend f = new Friend(friend, gender, age);
    
  }
}
class Friend{
  String friend;
  String gender;
  int age;
  Friend(String f, String g, int a){
    	 this.friend = f;
		  this.gender = g;
		  this.age = a;
    	 String str = "^[a-zA-Z]*$";
    	 String gen="^(?:Male|Female)$";
          Pattern pattern = Pattern.compile(str);	
        Matcher mat = pattern.matcher(this.friend);
    	Matcher matt = Pattern.compile(gen).matcher(gender);
        if((mat.find()) && (this.age>0) && (matt.matches()) ){
          
            System.out.println("Friends Details");

            System.out.println("Name: "+this.friend);
            //if(this.gender ="Male"|| this.gender = "Female"){
              System.out.println("Gender: "+this.gender);
            System.out.println("Age: "+this.age);
          }
        
    else{
    	System.out.println("Invalid Input");
    }
  }
  
}