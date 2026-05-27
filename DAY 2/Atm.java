package java_ignite_internship_day2;
import java.util.Scanner;
public class Atm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the atm holder name:");
		String name = sc.nextLine();
		System.out.println("Enter the account balance:");
		double balance = sc.nextDouble();
		System.out.println("Enter the withdrawl amount:");
		double withdrawl = sc.nextDouble();
		
		System.out.println("Account holder: " + name);
		System.out.println("Remaining balance: " + (balance - withdrawl));
		
		System.out.println("Status of balance > withdrawl : " + (balance > withdrawl));

	}

}
