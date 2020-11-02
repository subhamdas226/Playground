import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //type your code her
    Scanner sc= new Scanner(System.in);
	int n= sc.nextInt();
    int []arr = new int[n];
    int []arr2 = new int[n];
    for(int i=0;i<n;i++){
      	arr[i]= sc.nextInt();
      }
    for(int i=0;i<n;i++){
      	arr2[i]= sc.nextInt();
      }
    int flag=0;
    for(int i=0;i<n;i++){
      	
      if(arr[i]>=arr2[i]){
      	continue;
      }
      else{
      	flag=1;
        System.out.println("Incompatible");
        break;
      	}
      }
    if(flag==0){
    	System.out.println("Compatible");
    }
  }
}