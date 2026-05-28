package javaigniteDay3;
import java.util.Scanner;
public class Resturant{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose 1 for veg menu and 2 for non veg menu");
		int choice = sc.nextInt();
		int food;
		int quantity;
		int price=0;
		double discount = 0.0;
		switch(choice) {
		case 1:
			System.out.println("Food menu:");
			System.out.println("1.Fried Rice(150 ruppes) \n2. Noodles(300 ruppes)");
			food=sc.nextInt();
			if(food == 1) {
				System.out.println("Enter the quantity:");
				quantity=sc.nextInt();
				price=quantity*150;
			}
			if(food == 2) {
				System.out.println("Enter the quantity:");
				quantity=sc.nextInt();
				price=quantity*300;
			}
			break;
		case 2:
			System.out.println("Food menu:");
			System.out.println("1.Chicken biryani(250 ruppes) \n2.Grill Chicken(400 ruppes)");
			food=sc.nextInt();
			if(food == 1) {
				System.out.println("Enter the quantity:");
				quantity=sc.nextInt();
				price=quantity*250;
			}
			if(food == 2) {
				System.out.println("Enter the quantity:");
				quantity=sc.nextInt();
				price=quantity*400;
			}
			break;
		default:
			System.out.println("Invalid menu selection\n");
		}
		System.out.println("Quantity Member status (1.Gold/2.Silver/3.Normal)");
		int name = sc.nextInt();
		
		if(name == 1 && price > 2000) {
			System.out.println("CONGRATULATION !!!!! YOU WON NOTHING !!!");
		}
		if(name == 1) {
			discount=price*0.2;
			System.out.println("Amount to be paid is " + (price-discount));
		}
		else if(name == 2) {
			discount=price*0.1;
			System.out.println("Amount to be paid is " + (price-discount));
		}
		else if(name == 3) {
			System.out.println("Amount to be paid is " + price);
		}
		else
			System.out.println("Invalid selection");
		

	}

}