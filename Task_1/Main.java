import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		int score = 0;
		System.out.println("Number guess game !");
		System.out.println("You have 3 Attemptto win");
		while (true) {
			int comp = rd.nextInt(100);

			int i = 3;
			while (i > 0) {
				System.out.println("Your Attempt:" + i);
				System.out.print("Enter your choice:");
				int user = sc.nextInt();
				i--;
				if (user > comp) {
					System.out.println("your choice is high");
				} else if (user < comp) {
					System.out.println("your choice is low");
				} else {
					System.out.println("Correct answer you won!");
					score++;
					break;
				}
				Thread.sleep(2000);
				System.out.print("\033[H\033[2J");
				System.out.flush();

			}
			System.out.println("Your score:" + score);
			System.out.print("Do you want to continue (press 1):");

			int a = sc.nextInt();
			if (a == 1) {
				System.out.print("\033[H\033[2J");
				System.out.flush();
				continue;

			} else {
				break;
			}
		}
		rd.close();
		sc.close();
	}
}
