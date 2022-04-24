package gameApp.business.requests.deletes;

public class DeleteSaleRequest {
	
	private int id;

	public DeleteSaleRequest() {
		
	}

	public DeleteSaleRequest(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
