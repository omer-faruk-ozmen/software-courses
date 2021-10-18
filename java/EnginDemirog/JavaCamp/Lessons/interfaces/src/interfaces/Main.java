package interfaces;

public class Main {

	public static void main(String[] args) {
		
		Logger[] loggers = {new SmsLogger(),new EmailLogger(),new DatabaseLogger()};

		CustomerMenager customerMenager = new CustomerMenager(loggers);
		
		Customer omer = new Customer(1, "Ömer Faruk", "Özmen");
		
		customerMenager.add(omer);

	}

}
