package JavaIgniteDay5;
import java.util.Scanner;
public class arena {
	int whoiswinner(int p1_score,int p2_score) {
		if(p1_score > p2_score) {
			return 1;
		}
		else if(p1_score < p2_score) {
			return 2;
		}
		else
			return 3;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p1,p2;
		int result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the score of 1st player:");
		p1 = sc.nextInt();
		System.out.println("Enter the score of 2nd player:");
		p2 = sc.nextInt();
		arena win = new arena();
		result = win.whoiswinner(p1, p2);
		if(result == 1)
			System.out.println("1st player wins!");
		else if(result == 2)
			System.out.println("2nd player wins!");
		else if(result == 3)
			System.out.println("Match draw !");
		sc.close();
	}

}