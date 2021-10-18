package interfaces;

public class CustomerMenager {

	// bağımlı olduğumuz şeyin değişkeni
	private Logger[] loggers;

	public CustomerMenager(Logger[] loggers) {
		this.loggers = loggers;
	}

	// loosly(gevşek) - tightly coupled(katı bağlılık)
	public void add(Customer customer) {
		System.out.println("Müşteri eklendi " + customer.getFirstName());

		Utils.runLoggers(loggers, customer.getFirstName());
	}

	public void delete(Customer customer) {
		System.out.println("Müşteri silindi " + customer.getFirstName());
		
		Utils.runLoggers(loggers, customer.getLastName());

	}
}
