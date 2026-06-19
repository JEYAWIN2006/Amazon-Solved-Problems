
import java.util.*;
public class Main1
{
	public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
		    System.out.println("Enter the total number of products:");
		    int products=sc.nextInt();
		    System.out.println("Enter the capacity of boxes:");
		    int k=sc.nextInt();
		    int boxes=products/k;
		    System.out.println("Total Boxes Needed:"+boxes);
	}
}