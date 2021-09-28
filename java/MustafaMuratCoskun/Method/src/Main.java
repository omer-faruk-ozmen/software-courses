
public class Main {
	public static void topla(int x, int y, int z) {
		System.out.println("Toplam " + (x + y + z));
	}

	public static void selamlama(String isim) {
		System.out.println("Selamlar " + isim);
	}

	public static void main(String[] args) {
		selamlama("Omer Faruk");
		topla(1, 2, 3);

	}

}
