package classes;

public class Product {

	private int _id;
	private String _name;

	// getter
	public int getId() {
		// id değiştirilebilir burda işlemler yapılır
		// id okunabilir hale geldi.
		return _id;
	}

	// setter
	public void setId(int id) {
		id = _id;
	}

	// getter
	public String getName() {
		return _name;
	}

	// setter
	public void setName(String name) {
		name = _name;
	}

}
