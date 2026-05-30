package JavaIgniteDay4;
import java.util.Scanner;
public class Sumuntilnegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner("System.in");
		int n,s = 0;
		do {
			System.out.println("Enter the no. :");
			n = sc.nextInt();
			if(n >= 0)
				s=s+n;
		}while(n >= 0);
		System.out.println("Final sum is " + s);
	}

}