package gameApp.business.requests.deletes;

public class DeleteCampaignRequest {
	
	private int id;

	public DeleteCampaignRequest() {
		
	}

	public DeleteCampaignRequest(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
