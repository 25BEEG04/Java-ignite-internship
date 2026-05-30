package JavaIgniteDay4;
import java.util.Scanner;
public class Numberpyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.of rows:");
		int num = sc.nextInt();
		System.out.println("The pattern is:");
		int i,j;
		for(i=1;i<=num;i++) {
			for(j=1;j<=i;j++) {
				System.out.printf("%d ",j);
			}
			System.out.println("\n");
		}

	}

}