
import java.util.*;
public class Main2
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the sequence login ID attempts by users:");
	    String[] attempts=sc.nextLine().split("\\s+");
	    int count=0;
	    String current="";
	    for(String user:attempts){
	        if(user.equals(current)){
	            count++;
	        }
	        else{
	            current=user;
	            count=1;
	        }
	    
	    if(count>=3){
	        System.out.println(current+":The account is flagged as suspicious for security review");
	        break;
	    }
	  }
	}
}