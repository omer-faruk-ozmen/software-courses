package classes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.setId(1);
		product.setName("Leptop");
		
		ProductMenager productMenager = new ProductMenager();
		productMenager.Add(product);

	}

}
