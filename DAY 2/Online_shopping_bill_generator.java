package java_ignite_internship_day2;
import java.util.Scanner;
public class Online_shopping_bill_generator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your name:");
		String name = sc.nextLine();
		System.out.println("Enter product name:");
		String pname = sc.nextLine();
		System.out.println("Enter the price:");
		int price = sc.nextInt();
		System.out.println("Enter quantity:");
		int quantity = sc.nextInt();
		
		System.out.println("********FINAL BILL*******");
		System.out.println("Customer Name: " + name);
		System.out.println("Product Name:" + pname);
		System.out.println("Price :" + price);
		System.out.println("Quantitty: " + quantity);
		
		System.out.println("Final Amount: " + (price*quantity));
	}

}
