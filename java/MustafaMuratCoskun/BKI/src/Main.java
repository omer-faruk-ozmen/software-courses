import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("L�tfen Boyunuzu Giriniz.(CM)");
		double boy = scanner.nextDouble();
		boy = boy / 100.0;

		System.out.print("L�tfen Kilonuzu Giriniz.");
		int kg = scanner.nextInt();

		double bki = kg / (boy * boy);

		System.out.print("Beden Kitle �ndeksi: " + bki);

		if (bki >= 30.0) {
			System.out.println("\nObez");
		} else if (bki >= 25.0 && bki < 30.0) {
			System.out.println("\nFazla Kilolu");
		} else if (bki >= 18.5 && bki < 25.0) {
			System.out.println("\nNormal");
		} else if (bki < 18.5) {
			System.out.println("\nZay�f");
		} else {
			System.out.println("L�tfen do�ru bilgiler giriniz.");
		}

	}

}
