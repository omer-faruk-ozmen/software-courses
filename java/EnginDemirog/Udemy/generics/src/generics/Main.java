package generics;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		// tip güvenli çalışma için <String> verilir.

		ArrayList<String> sehirler = new ArrayList<String>();
		sehirler.add("Ankara");
		sehirler.add("İstanbul");

		// String dışında değer verilemez.
		// sehirler.add(1);

		// Customer
		// Product

		// Validator

		MyList<Customer> sehirler1 = new MyList<Customer>();
		sehirler1.add(new Customer());
		sehirler1.remove(new Customer());
		sehirler1.add(new Customer());
	}

}
