package gameApp.business.requests.creates;

public class CreateGameRequest {
	
	private int id;
	private String name;
	private double price;
	private double discountPrice;
	public CreateGameRequest() {
		
	}
	public CreateGameRequest(int id, String name, double price, double discountPrice) {
		
		this.id = id;
		this.name = name;
		this.price = price;
		this.discountPrice=discountPrice;
	}
	public double getDiscountPrice() {
		return discountPrice;
	}
	
	public void setDiscountPrice(double discountPrice) {
		this.discountPrice = discountPrice;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	

}
