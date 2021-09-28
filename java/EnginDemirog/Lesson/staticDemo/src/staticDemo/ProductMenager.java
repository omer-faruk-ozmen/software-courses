package staticDemo;

public class ProductMenager {
	public void add(Product product) {
		
		if(ProductValidater.isValid(product)) {
			System.out.println("Eklendi");
		}else { 
			System.out.println("Ürün bilgileri geçersiz");
		}
		
	}
}
