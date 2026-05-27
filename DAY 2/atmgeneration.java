package java_ignite_internship_day2;

import java.util.Scanner;

public class atmgeneration {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter ATM holder name -> ");
        String name = sc.nextLine();

        System.out.print("Please enter current account balance -> ");
        double balance = sc.nextDouble();

        System.out.print("Please enter withdrawal amount -> ");
        double withdrawal = sc.nextDouble();

        System.out.printf("\n===== ATM TRANSACTION DETAILS =====\n");
        System.out.printf("Account Holder : %s\n", name);
        System.out.printf("Available Balance After Withdrawal : %.2f\n", (balance - withdrawal));
        System.out.printf("Is Balance Greater Than Withdrawal? : %b\n", (balance > withdrawal));

        sc.close();
    }
}
