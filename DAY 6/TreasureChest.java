package JavaIgniteDay6;
import java.util.Scanner;
public class TreasureChest {
	String name,reward;
	int coins;
	
	TreasureChest(String n,int c){
		name = n;
		coins = c;
		if(c>=1000)
			reward = "Diamond Sword";
		else if(c < 1000 && c >= 500)
			reward = "Gold Sword";
		else
			reward = "Wooden Sword";
	}
	
	void display() {
		System.out.println("The reward based on your coins is :" + reward);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int coins;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name and coins collected :");
		name = sc.nextLine();
		coins = sc.nextInt();
		TreasureChest res = new TreasureChest(name,coins);
		res.display();
		sc.close();
	}

}