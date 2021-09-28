import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		if (scanner.hasNextInt()) {
			int yas = scanner.nextInt();

			System.out.println("Yaþýnýz: " + yas);

		} else {
			System.out.println("Lütfen yaþýnýzý girin:");
		}

	}

}
