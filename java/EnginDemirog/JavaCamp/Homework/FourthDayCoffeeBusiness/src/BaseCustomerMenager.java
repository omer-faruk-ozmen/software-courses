
public abstract class BaseCustomerMenager implements CustomerService {

	@Override
	public void save(Customer customer) {
		System.out.println("Veritabanına kaydedildi : " + customer.firstName);

	}

}
