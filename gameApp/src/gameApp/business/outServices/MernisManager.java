package gameApp.business.outServices;

import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisManager  {

	public boolean addPerson(String identityNumber, String firstName, String lastName, int yearOfBirth) {
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		try {
			return kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(identityNumber),
					firstName.toUpperCase(),lastName.toUpperCase(),yearOfBirth);
		} catch (NumberFormatException | RemoteException e) {
			e.printStackTrace();
		}
		return false;
		
	}

}
