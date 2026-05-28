package JavaIgniteDay3;
import java.util.Scanner;

public class Login_System {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Username: ");
			String userName = sc.nextLine();
			System.out.println("Enter the Password: ");
			String password = sc.nextLine();
			
			
			switch(userName)
			{
			case "admin":
				switch(password)
				{
				case "Java@123":
					System.out.println("OTP: ");
					int otp = sc.nextInt();
					if(otp>=1000 && otp<=9999)
					{
						System.out.println("Successfully entered the account!");
					}
					else
					{
						System.out.println("Invalid OTP!\nTry again!");
					}
				break;
				
				case "Java":
				case "123":
					System.out.println("Almost correct password!");
					break;
				
				default:
					System.out.println("Wrong password! Try again!");
					System.out.println("Password: ");
					password = sc.nextLine();
					switch(password)
					{
						default:
						System.out.println("Wrong password! Try again!");
						System.out.println("Password: ");
						password = sc.nextLine();
						switch(password)
						{
							default:
							System.out.println("Wrong password! Account blocked!");
							break;
							case "Java@123":
						
							System.out.println("OTP: ");
							otp = sc.nextInt();
							if(otp>=1000 && otp<=9999)
							{
								System.out.println("Successfully entered the account!");
							}
							else
							{
								System.out.println("Invalid OTP!\nTry again!");
							}
							break;
						}
						break;
					
						case "Java@123":
						System.out.println("OTP: ");
						otp = sc.nextInt();
						if(otp>=1000 && otp<=9999)
						{
							System.out.println("Successfully entered the account!");
						}
						else
						{
							System.out.println("Invalid OTP!\nTry again!");
						}
						break;
					}
					break;
					
				}	
			break;
			
			default:
				System.out.println("Wrong username!");
				
			}
			sc.close();
	}


}