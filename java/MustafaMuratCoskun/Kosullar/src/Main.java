import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int not;
		System.out.print("Lütfen notunuzu giriniz...: ");
		not = scanner.nextInt();
		
		if(not>=90) {
			System.out.print("AA");
		}
		else if (not>=85) {
			System.out.println("AB");
		}
		else if (not>=80) {
			System.out.println("BA");
		}
		else if (not>=75) {
			System.out.println("BB");
		}
		else if (not>=70) {
			System.out.println("CB");
		}
		else if (not>=65) {
			System.out.println("DC");
		}
		else if (not>=60) {
			System.out.println("DD");
		}
		else {
			System.out.println("KALDINIZ");
		}
	}

}
