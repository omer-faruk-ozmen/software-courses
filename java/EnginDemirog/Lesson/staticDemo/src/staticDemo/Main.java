package staticDemo;

public class Main {

	public static void main(String[] args) {
		ProductMenager menager = new ProductMenager();
		Product product = new Product();
		product.price = 10;
		product.name = "";
		
		menager.add(product);

		
		//önerilmiyor. Birbirine benzeyen operasyonlar parçalanır ama her biri kendi classı altında.
		//inner class çok fazla kullanılmaz.
		DatabaseHelper.Crud.Delete();
		DatabaseHelper.Connection.createConnection();
	}

}
