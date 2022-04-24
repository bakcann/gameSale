package gameApp.business.requests.deletes;

public class DeleteGameRequest {
	
	private int id;

	public DeleteGameRequest() {
		
	}

	public DeleteGameRequest(int id) {
		
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
