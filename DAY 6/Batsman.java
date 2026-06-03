package JavaIgniteDay6;
import java.util.Scanner;
public class Batsman {
	
	String name;
	int run,ball;
	double strikerate;

	Batsman(String n,int r, int b){
		name = n;
		run = r;
		ball = b;
		if(b>0)
			strikerate =(double)(r * 100)/b;
		else
			strikerate = 0;
	}
	void display() {
		System.out.printf("Name is %s \n",name);
		System.out.printf("%d balls played\n",ball);
		System.out.printf("%d runs scored\n",run);
		System.out.printf("%.2f is the strike rate",strikerate);
	}
	public static void main(String[] args) {
		String name;
		int balls,runs;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name , run , balls played :");
		name = sc.nextLine();
		run = sc.nextInt();
		ball = sc.nextInt();
		Batsman bat = new Batsman(name,run,ball);
		bat.display();
		sc.close();
		
		

	}

}