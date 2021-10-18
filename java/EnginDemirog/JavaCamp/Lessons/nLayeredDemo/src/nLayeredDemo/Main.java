package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductMenager;
import nLayeredDemo.core.JLoggerMenagerAdapter;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {

		// ToDo: Spring IoC ile çözülecek
		// Kötü kod
		ProductService productService = new ProductMenager(new AbcProductDao(), new JLoggerMenagerAdapter());

		Product product = new Product(1, 2, "Elma", 12, 50);
		productService.add(product);

	}

}
