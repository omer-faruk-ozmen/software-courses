import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		if (scanner.hasNextInt()) {
			int yas = scanner.nextInt();

			System.out.println("Ya��n�z: " + yas);

		} else {
			System.out.println("L�tfen ya��n�z� girin:");
		}

	}

}
