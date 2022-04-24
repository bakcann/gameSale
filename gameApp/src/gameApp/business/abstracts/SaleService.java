package gameApp.business.abstracts;

import gameApp.business.requests.creates.CreateSaleRequest;
import gameApp.business.requests.deletes.DeleteSaleRequest;
import gameApp.business.requests.updates.UpdateSaleRequest;

public interface SaleService {
	
	public void add(CreateSaleRequest createSaleRequest);
	public void delete(DeleteSaleRequest deleteSaleRequest);
	public void update(UpdateSaleRequest updateSaleRequest);

}
