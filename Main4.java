import java.util.*;
public class Main4 {
    public static void main(String[] args) {
        System.out.println("Enter the current stock level :");
        Scanner sc =new Scanner(System.in);
        int currentStock=sc.nextInt();
        System.out.println("Enter the threshold level:");   
        int threshold=sc.nextInt();    
        if (currentStock<threshold){
            System.out.println("Restocking Alert: Current stock is below the minimum threshold. Order placed/flagged.");
        } else {
            System.out.println("Stock levels are normal. No restocking needed.");
        }
    }
}
