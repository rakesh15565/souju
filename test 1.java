package rakeshsss.souju;
import java.util.Scanner;

public class StoreDiscount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter age, number of items, total price: ");
        int age = scanner.nextInt(), numOfItems = scanner.nextInt();
        double totalPrice = scanner.nextDouble(), discount = (age < 18 ? 10 : age >= 60 ? 15 : 0) + (numOfItems > 1 ? 5 : 0);
        
        double finalPrice = totalPrice * (1 - discount / 100);
        System.out.println("Total Discount: " + discount + "%\nFinal Price: $" + finalPrice);
        
        scanner.close();
    }
}