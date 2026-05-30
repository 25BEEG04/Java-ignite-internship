package JavaIgniteDay4;
import java.util.Scanner;
public class pin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int correctpin = 1979;
		int n;
		System.out.println("Enter the pin :");
	    n = sc.nextInt();
	    while(n != correctpin) {
	    	System.out.println("Wrong Pin! Try Again \nEnter the pin :");
		    n = sc.nextInt();
	    }
	    if(n == correctpin) {
	    	System.out.println("Corrct Pin");
	    }
	}

}