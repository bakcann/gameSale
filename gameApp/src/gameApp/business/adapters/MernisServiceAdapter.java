package gameApp.business.adapters;

import gameApp.business.abstracts.MernisService;
import gameApp.business.outServices.MernisManager;
import gameApp.entities.concretes.User;

public class MernisServiceAdapter implements MernisService{

	@Override
	public boolean checkIfRealPerson(User user) {
		
		MernisManager mernisManager = new MernisManager();
		
		mernisManager.addPerson(user.getIdentityNumber(),user.getFirstName(),user.getLastName(),user.getYearOfBirth());
		
		
		return true;
	}

}
