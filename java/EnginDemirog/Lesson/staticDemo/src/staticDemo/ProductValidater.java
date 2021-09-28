package staticDemo;

public class ProductValidater {
	
	static {
		System.out.println("Yapıcı blok çalıştı");
	}
	
	
	//static bellekte yer tutar.
	public static boolean isValid(Product product) {
		if(product.price>0 && !product.name.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
	
	//static değilse new'lemek gerekir.
	public void bisey() {
		
	}
	
	//inner class
	//class'ın içindeki class static olabilir
	public static class BaskaBirClass{
		public static void Sil() {
			
		}
	}
}
