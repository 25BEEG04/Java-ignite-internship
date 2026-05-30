package JavaIgniteDay5;
import java.util.Scanner;
public class Grading {
	char grade(int marks) {
		if(marks >= 90)
			return 'A';
		else if(marks < 90 && marks >= 70)
			return 'B';
		else if(marks < 70 && marks >= 50)
			return 'C';
		else {
			System.out.println("The student needs to study more! ");
			return 'F';
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int mark;
		char result;
		System.out.println("Enter the marks of the student:");
		mark = sc.nextInt();
		Grading grade_students = new Grading();
		result = grade_students.grade(mark);
		System.out.println("The Grade is obtained :");
		System.out.printf("%c Grade",result);
		sc.close();
	}

}