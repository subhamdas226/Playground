// import the respective packages
// declare the class/classes mentioned in the above statements by using default access modifiers
//Ex. If ProGrad is the class name, then declare it as class ProGrad{ } without any access modifier

//Main class to control all other classes

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		long id = sc.nextLong();
      	sc.nextLine();
		String skills = sc.nextLine();
		Prograd p = new Prograd(name, id, skills);
	}
}
class Prograd{
	  String name;
	  long id;
	  String skills;
	  public Prograd(String n,long i,String sk) {
		  this.name = n;
		  this.id = i;
		  this.skills = sk;
          String str = "^[a-zA-Z ]*$";
          //String num = "^[0-9]*$";
          Pattern pattern = Pattern.compile(str);	
          
		  
        Matcher mat = pattern.matcher(this.name);
      
        if(mat.find() && this.id>0){
          System.out.println("ProGrad Details");
		  System.out.println("ProGrad Name: "+this.name);
        
		  System.out.println("Id: "+this.id);
		  System.out.println("Skill: "+this.skills);
          }
        else{
        	System.out.println("Invalid Input");
        }
	  }
	}
