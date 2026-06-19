//3. Suspicious Login Attempt Detection
//Problem Statement
//Amazon’s security system tracks login attempts made by users. If the same user ID attempts to log in more than 3 times consecutively, the account is flagged as
//suspicious for security review. Given a sequence of login attempts, determine whether any suspicious activity exists.

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
