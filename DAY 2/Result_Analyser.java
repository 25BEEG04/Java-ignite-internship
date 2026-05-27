package java_ignite_internship_day2;

import java.util.Scanner;

public class Result_Analyser {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the student's name: ");
        String name = sc.nextLine();

        System.out.println("Enter the marks of 3 subjects:");
        double mark1 = sc.nextDouble();
        double mark2 = sc.nextDouble();
        double mark3 = sc.nextDouble();

        double totalMarks = mark1 + mark2 + mark3;
        double average = totalMarks / 3;

        System.out.println("\n===== RESULT ANALYSIS =====");
        System.out.println("Student Name : " + name);
        System.out.println("Total Marks  : " + totalMarks);
        System.out.println("Average Marks: " + average);
        System.out.println("Passed (Average >= 50): " + (average >= 50));

        sc.close();
    }
}
