package throwDemo;

public class Main {

	public static void main(String[] args) {
		AccountMenager menager = new AccountMenager();
		System.out.println("Hesap = " + menager.getBalance());
		menager.deposit(100);
		System.out.println("Hesap = " + menager.getBalance());
		try {
			menager.withdraw(90);
		} catch (BalanceInsufficentException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Hesap = " + menager.getBalance());
		try {
			menager.withdraw(20);
		} catch (BalanceInsufficentException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Hesap = " + menager.getBalance());

	}

}
