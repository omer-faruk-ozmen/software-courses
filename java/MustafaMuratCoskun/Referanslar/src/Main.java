
public class Main {

	public static void main(String[] args) {
		Account account = new Account("521515", 0.0, "omer faruk ozmen", "omerfarukozmen@", "34234");
		Account account1 = account;
		Account account2 = new Account();

		if (account == account2) {
			System.out.println("Aynı Objeyi gösteriyorlar");
		} else {
			System.out.println("Aynı objeyi göstermiyorlar");
		}

	}

}
