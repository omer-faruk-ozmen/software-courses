
public class Main {
	public static int topla(int x, int y, int z) {
		// System.out.println(x + y + z);
		return (x + y + z);
	}

	public static int ikiilecarp(int x) {
		return x * 2;
	}

	public static int ikiiletopla(int x) {
		return x + 2;
	}

	public static int dortilecarp(int x) {
		return x * 4;
	}

	public static void main(String[] args) {
		// topla(1, 2, 3);
		System.out.println("��kt� De�eri " + topla(1, 2, 3));

		System.out.println("Sonu� " + dortilecarp(ikiiletopla(ikiilecarp(8))));
	}

}
