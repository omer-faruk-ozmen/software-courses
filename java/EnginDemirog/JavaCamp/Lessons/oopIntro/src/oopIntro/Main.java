package oopIntro;

public class Main {

	public static void main(String[] args) {

		Product product1 = new Product(1, "Lenovo V15",
				"8Gb ram", 8000);

		Product product2 = new Product(2, "Lenovo IdeaPad",
				"16gb ram", 10000);

		Product product3 = new Product(3, "HP 5",
				"32gb ram", 16000);

		Product[] products = { product1, product2, product3 };

		for (Product product : products) {
			System.out.println(product.name);
		}

		Category category1 = new Category();
		category1.id = 1;
		category1.name = "Bilgisayar";
		
		
		ProductService productService = new ProductService();
		
		
		productService.addToCart(products);
		

	}

}
