package loopDemo;

public class loopDemo {

	public static void main(String[] args) {

		for (int i = 2; i < 20; i+=2) {
			System.out.println(i);
		}
		System.out.println("For Döngüsü Bitti");
		
		int i = 1;
		//While		(önce şartı sorgular sağlanıyorsa döngüye girer.)
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		System.out.println("While Döngüsü Bitti");
		
		//Do While  (önce değeri yazdırır sonra şartı sorgular.)
		int j=1;
		do {
			System.out.println(j);
			j++;
		}while(j<10);
		System.out.println("Do While Döngüsü Bitti");
	}

}
