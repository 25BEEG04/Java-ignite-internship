package JavaIgniteDay4;
import java.util.Scanner;
public class Reversestar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of stars in the first row:");
		int r = sc.nextInt();
		System.out.println("The requried pattern :");
		int i,j;
		for(i=1;i<=r;i++) {
			for(j=r;j>=i;j--) {
				System.out.printf("* ");
			}
			System.out.println("");
		}

	}

}