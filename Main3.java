
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