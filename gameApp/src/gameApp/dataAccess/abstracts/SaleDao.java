package gameApp.dataAccess.abstracts;

import gameApp.entities.concretes.Sale;

public interface SaleDao {
	public void add(Sale sale);
	public void delete(Sale sale);
	public void update(Sale sale);

}
