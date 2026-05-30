package JavaIgniteDay5;
import java.util.Scanner;
public class Travelexpense {
	double travel_cost(double petrol_price,double mileage, double distance) {
		double petrol=distance/mileage;
		double travel_cost = petrol_price*petrol;
		if(mileage == 0) {
			System.out.println("Not Posible");
			return 0;	
		}
		return travel_cost;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the distance travelled:");
		double distance = sc.nextDouble();
		System.out.println("Enter the mileage:");
		double mileage = sc.nextDouble();
		System.out.println("Enter the petrol price:");
		double petrol_price = sc.nextDouble();
		
		Travel_expense price = new Travel_expense();
		result=price.travel_cost(petrol_price, mileage, distance);
		System.out.printf("Final amount needed for the trip is %.2f",result);
		sc.close();
	}

}