package JavaIgniteDay4;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		int temp = num;
		double rem,rev=0;
		while(temp != 0) {
			rem = temp % 10;
			rev =(rev*10)+rem;
			temp=temp/10;
		}
		if(rev == num) {
			System.out.println("It is a palindrome number");
		}
		else {
			System.out.println("It is not a palindrome number");
		}
	}

}