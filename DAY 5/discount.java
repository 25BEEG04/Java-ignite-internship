package JavaIgniteDay5;
import java.util.Scanner;
public class discount {
	int discount_amount(int amount,int discount) {
		int disc=amount*discount/100;
		int final_amount= amount-disc;
		return final_amount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int original_amount,discount,final_price;
		System.out.println("Enter the original amount :");
		original_amount = sc.nextInt();
		System.out.println("Enter the discount(%) :");
		discount = sc.nextInt();
		Shopping_discount shop = new Shopping_discount();
		final_price = shop.discount_amount(original_amount, discount);
		System.out.printf("After applying discount, the bill amount : %d",final_price);
		sc.close();
	}

}