package isthere.spring.vo;

public class Stock {
	private String shop_id;
	private String item_code;
	private int stock;
	
	
	public Stock(String shop_id, String item_code, int stock) {
		super();
		this.shop_id = shop_id;
		this.item_code = item_code;
		this.stock = stock;
	}
	public String getShop_id() {
		return shop_id;
	}
	public void setShop_id(String shop_id) {
		this.shop_id = shop_id;
	}
	public String getItem_code() {
		return item_code;
	}
	public void setItem_code(String item_code) {
		this.item_code = item_code;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
}
