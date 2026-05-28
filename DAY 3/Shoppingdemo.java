package JavaIgniteDay3;

public class Shopping_Demo {
	public static void main(String[] args) {
		double amt = 10000;
		boolean PremiumUser = true;
		if(amt >= 5000 && PremiumUser)
		{
			System.out.println("30% Discount awarded! ");
		}
		else if(amt >= 5000 || PremiumUser)
		{
			System.out.println("10% Discount awarded! ");
		}
		else
		{
			System.out.println("No Discount! ");
		}
	}

}