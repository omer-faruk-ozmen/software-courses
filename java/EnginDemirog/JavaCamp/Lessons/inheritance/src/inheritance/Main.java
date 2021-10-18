package inheritance;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer omer = new IndividualCustomer();
		omer.customerNumber = "12345";

		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber = "78910";

		SendikaCustomer abc = new SendikaCustomer();
		abc.customerNumber = "101112";

		CustomerMenager customerMenager = new CustomerMenager();

		Customer[] customers = { omer, abc, hepsiBurada };

		customerMenager.addMultiple(customers);

	}

}
