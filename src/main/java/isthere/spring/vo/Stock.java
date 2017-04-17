package isthere.spring.vo;

import java.sql.Date;

public class Stock {
	private String item_code;
	private int shop_id;
	private Date stock_time;
	private String stock_info;
	private int stock;
	
	public Stock(int shop_id, String item_code, String stock_info, int stock) {
		super();
		this.shop_id = shop_id;
		this.item_code = item_code;
		this.stock_info = stock_info;
		this.stock = stock;
	}
	
	
	public String getStock_info() {
		return stock_info;
	}


	public void setStock_info(String stock_info) {
		this.stock_info = stock_info;
	}


	public Date getStock_time() {
		return stock_time;
	}


	public void setStock_time(Date stock_time) {
		this.stock_time = stock_time;
	}


	public int getShop_id() {
		return shop_id;
	}
	public void setShop_id(int shop_id) {
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
