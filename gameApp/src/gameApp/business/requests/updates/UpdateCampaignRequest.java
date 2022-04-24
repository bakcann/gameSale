package gameApp.business.requests.updates;

public class UpdateCampaignRequest {
	
	private int id;
	private String name;
	private double participationLimit;
	private double discount;
	public UpdateCampaignRequest() {
		
	}
	public UpdateCampaignRequest(int id, String name,double participationLimit, double discount) {
		
		this.id = id;
		this.name = name;
		this.discount = discount;
		this.participationLimit =participationLimit;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getParticipationLimit() {
		return participationLimit;
	}
	public void setParticipationLimit(double participationLimit) {
		this.participationLimit = participationLimit;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}



}
