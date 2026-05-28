package JavaIgniteDay3;
import  java.util.Scanner;

public class College_Admission {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Maths marks:");
			int m1= sc.nextInt();
			System.out.println("Physics marks:");
			int m2= sc.nextInt();
			System.out.println("Chemistry marks:");
			int m3= sc.nextInt();
			double average = (m1+m2+m3)/3;
			
			if(m1<=35 || m2<=35 || m3<= 35)
			{
				System.out.println("Admission rejected!");
			}
			else if(m1>=90 && m2>=90 && m3>=90)
			{
				System.out.println("Eligible : Admission granted, Scholarship awarded!");
			}
			else if((m1>=70 && m2>=60 && m3>=60)||average>=80)
			{
				System.out.println("Admission granted, Scholarship not awarded");
			}
			sc.close();
	}

}
