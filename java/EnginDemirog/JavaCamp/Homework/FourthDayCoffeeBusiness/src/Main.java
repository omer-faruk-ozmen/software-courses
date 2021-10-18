import java.time.LocalDate;



public class Main {

	
	public static void main(String[] args) {
		
		Customer omer = new Customer();
		omer.setFirstName("Ömer Faruk");
		omer.setLastName("Özmen");
		omer.setDateOfBirth(LocalDate.of(1999, 2, 14));
		omer.setNationalityId("63007162072");

		BaseCustomerMenager baseCustomerMenager = new StarbucksCustomerMenager(new PersonCheckMenager());
		baseCustomerMenager.save(omer);

	}

}
