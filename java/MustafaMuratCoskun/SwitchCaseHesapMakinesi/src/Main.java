import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String islemler = """
				L�tfen yapmak istedi�iniz i�lemi yaz�p enter'a bas�n
				1) Toplama
				2) ��karma
				3) �arpma
				4) B�lme
				""";

		System.out.println(islemler);
		
		int secim = scanner.nextInt();
		
		System.out.print("1.Say�y� giriniz.");
		int sayi1 = scanner.nextInt();
		
		System.out.print("2.Say�y� giriniz.");
		int sayi2 = scanner.nextInt();
		
		
		switch(secim) {
		case 1:
			System.out.println(sayi1 + sayi2);
			break;
		case 2: 
			System.out.println(sayi1 - sayi2);
			break;
		case 3:
			System.out.println(sayi1 * sayi2);
			break;
		case 4:
			System.out.println((double)sayi1 / sayi2);
			break;
		}
	}

}
