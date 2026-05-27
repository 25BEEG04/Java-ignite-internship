package java_ignite_internship_day2;
import java.util.Scanner;
public class Travel_Expense_Estimator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the travel distance (in km)");
		double dist = sc.nextDouble();
		System.out.println("Enter the petrol price (per lit)");
		double price = sc.nextDouble();
		System.out.println("Enter the vehicle milleage:");
		double milleage = sc.nextDouble();
		
		double petrol = dist/milleage;
		double p_price = petrol * price;
		
		System.out.println("Petrol used is " + petrol + " litre petrol price is " + p_price);

	}

}
