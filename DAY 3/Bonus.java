package JavaIgniteDay3;
import java.util.Scanner;

public class Employee_Bonus {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter number of working years:");
			int year = sc.nextInt();
			System.out.println("Enter the attendance (in %):");
			double attendance = sc.nextDouble();
			System.out.println("Enter performance rating (1-5):");
			int rating = sc.nextInt();
			
			if(attendance>85 && year>3)
			{
				System.out.println("Eligible for bonus");
				switch(rating)
				{
					case 5:
						System.out.println("Bonus Rewarded : Rs. 50,000");
						break;
					case 4:
						System.out.println("Bonus Rewarded : Rs. 30,000");
						break;
					case 3:
						System.out.println("Bonus Rewarded : Rs. 10,000");
						break;
					default:
						System.out.println("no bonus!");
				}
			}
			else if(attendance<60)
			{
				System.out.println("Not eligible for bonus");
			}
			sc.close();
	}

}

