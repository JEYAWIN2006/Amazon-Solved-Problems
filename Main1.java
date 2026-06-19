//2. Warehouse Box Arrangement
//Problem Statement
//Amazon warehouses receive thousands of products daily. To optimize space, products are packed into large storage boxes. Each box can hold exactly K products. 
//If some products remain, an extra box must be allocated. Given the total number of products arriving in a shipment and the c’apacity of each box, determine 
//how many boxes are required.

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
