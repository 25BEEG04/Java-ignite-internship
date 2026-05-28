package JavaIgniteDay3;
import java.util.Scanner;

public class Restaurant_Ordering_System {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter main menu (veg/non-veg):");
		String main_menu= sc.nextLine();
		
		switch(main_menu)
		{
		case "veg":
			System.out.println("Item selection:\n1.Fried Rice (Rs.280)\n2.Biryani (Rs.250)");
			int menu = sc.nextInt();
			switch(menu)
			{
			case 1:
				System.out.println("Quantity:");
				int qty = sc.nextInt();
				System.out.println("Memeber:\n1.Gold\n2.Silver\n3.Normal");
				int member = sc.nextInt();
				int total = 200*qty;
				switch(member)
				{
				case 1:
					double discount= 0.2*total;
					double bill=total-discount;
					if(bill>2000) {
					System.out.println("Amount in Rs."+bill+"\nFree desert as well!");
					}
					else
					{
						System.out.println("Amount in Rs."+bill);
					}
				break;
				
				case 2:
					discount= 0.1*total;
					bill=total-discount;
					System.out.println("Amount in Rs."+bill);
				break;
				
				case 3:
					System.out.println("Amount in Rs."+total);
					break;
				default:
					System.out.println("Invalid membership");
				}
			break;
			
			case 2:
				System.out.println("Quantity:");
				 qty = sc.nextInt();
				System.out.println("Memeber:\n1.Gold\n2.Silver\n3.Normal");
				member = sc.nextInt();
				 total = 100*qty;
				switch(member)
				{
				case 1:
					double discount= 0.2*total;
					double bill=total-discount;
					if(bill>2000) {
					System.out.println("Amount in Rs."+bill+"\nFree desert as well!");
					}
					else
					{
						System.out.println("Amount in Rs."+bill);
					}
				break;
				
				case 2:
					discount= 0.1*total;
					bill=total-discount;
					System.out.println("Amount in Rs."+bill);
				break;
				
				case 3:
					System.out.println("Amount in Rs."+total);
					break;
				default:
					System.out.println("Invalid membership");
				}
			break;
			
			default:
				System.out.println("Invalid menu");
			}
		break;
		
		case "non-veg":
			System.out.println("Item selection:\n1.Chicken Biryani (Rs.350)\n2. Chicken-65 (Rs.280)");
			 menu = sc.nextInt();
			switch(menu)
			{
			case 1:
				System.out.println("Quantity:");
				int qty = sc.nextInt();
				System.out.println("Memeber:\n1.Gold\n2.Silver\n3.Normal");
				int member = sc.nextInt();
				int total = 200*qty;
				switch(member)
				{
				case 1:
					double discount= 0.2*total;
					double bill=total-discount;
					if(bill>2000) {
					System.out.println("Amount in Rs."+bill+"\nFree desert as well!");
					}
					else
					{
						System.out.println("Amount in Rs."+bill);
					}
				break;
				
				case 2:
					discount= 0.1*total;
					bill=total-discount;
					System.out.println("Amount in Rs."+bill);
				break;
				
				case 3:
					System.out.println("Amount in Rs."+total);
					break;
				default:
					System.out.println("Invalid membership");
				}
			break;
			
			case 2:
				System.out.println("Quantity:");
				 qty = sc.nextInt();
				System.out.println("Memeber:\n1.Gold\n2.Silver\n3.Normal");
				 member = sc.nextInt();
				 total = 100*qty;
				switch(member)
				{
				case 1:
					double discount= 0.2*total;
					double bill=total-discount;
					if(bill>2000) {
					System.out.println("Amount in Rs."+bill+"\nFree desert as well!");
					}
					else
					{
						System.out.println("Amount in Rs."+bill);
					}
				break;
				
				case 2:
					discount= 0.1*total;
					bill=total-discount;
					System.out.println("Amount in Rs."+bill);
				break;
				
				case 3:
					System.out.println("Amount in Rs."+total);
					break;
				default:
					System.out.println("Invalid membership");
				}
			break;
			
			default:
				System.out.println("Invalid menu");
			}
		break;
			
		}
		sc.close();
	}


}
