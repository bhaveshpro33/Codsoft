import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter English marks: ");
		int English = sc.nextInt();
		System.out.println("Enter Maths marks: ");
		int Maths = sc.nextInt();
		System.out.println("Enter Science marks: ");
		int Science = sc.nextInt();
		System.out.println("Enter Gujarati marks: ");
		int Gujarati = sc.nextInt();
		System.out.println("Enter Hindi marks: ");
		int Hindi = sc.nextInt();
		int Total = English + Maths + Science + Gujarati + Hindi;
		System.out.println("The total marks:" + Total);
		float avg_per = (Total / 500.9f) * 100;
		System.out.println("The Average percentage:" + avg_per);
		if (avg_per > 90 && avg_per == 100) {
			System.out.println("Your Grade: A");
		} else if (avg_per > 70 && avg_per <= 90) {
			System.out.println("Your Grade: B");
		} else if (avg_per > 50 && avg_per <= 70) {
			System.out.println("Your Grade: C");
		} else if (avg_per > 40 && avg_per <= 50) {
			System.out.println("Your Grade: D");
		} else if (avg_per > 35 && avg_per <= 40) {
			System.out.println("Your Grade: E");
		} else {
			System.out.println("Your Grade: F (Fail!)");

		}
       sc.close();
	}
}
