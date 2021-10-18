
public class StarbucksCustomerMenager extends BaseCustomerMenager {

	PersonCheckService personCheckService;

	public StarbucksCustomerMenager(PersonCheckService personCheckService) {
		this.personCheckService = personCheckService;
	}

	@Override
	public void save(Customer customer) {
		if (personCheckService.checkIfRealPerson(customer)) {
			super.save(customer);
		} else {
			System.out.println("Geçerli bir kişi değil");
		}

	}

}
