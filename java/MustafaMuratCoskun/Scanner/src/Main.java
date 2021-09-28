import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int yas = scanner.nextInt();
		scanner.nextLine();

		String isim = scanner.nextLine();

		System.out.println("Yaþ: " + yas);
		System.out.println("Ýsim: " + isim);

	}

}
