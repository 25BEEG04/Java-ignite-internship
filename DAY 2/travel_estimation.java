package java_ignite_internship_day2;

import java.util.Scanner;

public class travel_estimation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the travel distance (in km): ");
        double dist = sc.nextDouble();

        System.out.print("Enter the petrol price (per litre): ");
        double price = sc.nextDouble();

        System.out.print("Enter the vehicle mileage: ");
        double mileage = sc.nextDouble();

        double petrol = dist / mileage;
        double totalPrice = petrol * price;

        System.out.printf("\n===== Travel Expense Report =====\n");
        System.out.printf("Distance Travelled : %.2f km\n", dist);
        System.out.printf("Petrol Used        : %.2f litres\n", petrol);
        System.out.printf("Total Petrol Cost  : %.2f\n", totalPrice);

        sc.close();
    }
}
