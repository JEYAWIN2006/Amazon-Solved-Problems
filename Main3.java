//4. Delivery Partner Performance Check
//Problem Statement
//Amazon evaluates its delivery partners daily. Each partner’s delivery time (in minutes) is recorded. The management wants to identify the fastest delivery 
//completed in a day. Given the delivery times of all partners, determine the minimum delivery time.

import java.util.*;
public class Main3
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of delivery partners");
		int deliverypartners=sc.nextInt();
		System.out.println("Enter the partners delivery time in minutes:");
		float[] time=new float[deliverypartners];
		for(int i=0;i<deliverypartners;i++){
		    time[i]=sc.nextFloat();
		}
		Arrays.sort(time);
		float min=time[0];
		System.out.println("The minimum delivery time is:" +min+ " minutes");
	}
}
