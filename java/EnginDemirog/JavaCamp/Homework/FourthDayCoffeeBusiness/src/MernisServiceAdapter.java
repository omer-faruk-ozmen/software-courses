import java.rmi.RemoteException;
import tr.gov.nvi.tckimlik.WS.*;

public class MernisServiceAdapter implements PersonCheckService {

	
	@Override
	public boolean checkIfRealPerson(Customer customer) {
		KPSPublicSoap client = new KPSPublicSoapProxy();
		boolean deneme = false;
		try {
			deneme =  client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),customer.getFirstName(), customer.getLastName(),customer.getDateOfBirth().getYear());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (RemoteException e) {
			e.printStackTrace();
		}
		return deneme;

	}

}
