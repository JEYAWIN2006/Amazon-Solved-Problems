//1. Prime Delivery Charge Calculator
//Problem Statement
//Amazon is testing a new delivery billing system. Every customer places an order with a purchase amount. If the amount is above ₹2000,
//the customer gets free delivery. Otherwise, a delivery fee of ₹150 is added. If the customer is a Prime member, the delivery fee is reduced by 50%.
//Given the purchase amount and Prime membership status, determine the final amount payable by the customer.


import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    double deliveryamount;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the purchase amount of a customer:");
		double purchaseamount=sc.nextDouble();
		System.out.println("Are you an Amazon prime member [true/false]:");
		boolean member=sc.nextBoolean();
		if(purchaseamount>2000){
		    deliveryamount=0;
			System.out.println("Delivery charges:Free");
		}
		else{
		    if(member){
		        deliveryamount=150*0.5;
		    }
		    else{
		        deliveryamount=150;
		    }
		}
		double totalamount=purchaseamount+deliveryamount;
		System.out.println("Total amount payable:"+totalamount);
	}
}
