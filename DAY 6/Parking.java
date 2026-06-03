package JavaIgniteDay6;
import java.util.Scanner;
public class Parking {
	int choice,time,fee;
	Parking(int c, int t){
		if(c == 1)
			fee = 10*t;
		else if(c == 2)
			fee = 30*t;
		else
			fee = 50*t;
	}
	void display() {
		System.out.printf("The fees to be paid is %d\n",fee);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch,time;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the choice \n1.Bike \n2.Car \n3.Bus :\n");
		ch = sc.nextInt();
		System.out.println("Enter the time used in hours\n");
		time = sc.nextInt();
		Parking park = new Parking(ch,time);
		park.display();
		sc.close();
		

	}

}