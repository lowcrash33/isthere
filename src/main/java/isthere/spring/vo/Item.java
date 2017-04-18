package isthere.spring.vo;

import java.sql.Date;

public class Item {
	private String item_code;
	private String item_name;
	private int item_price;
	private String item_type;
	private Date item_time;
	private String item_info;
	private String item_brand;
	private String item_image;
	private int stock_stock;
	
	public String getItem_code() {
		return item_code;
	}
	public void setItem_code(String item_code) {
		this.item_code = item_code;
	}
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public int getItem_price() {
		return item_price;
	}
	public void setItem_price(int item_price) {
		this.item_price = item_price;
	}
	public String getItem_type() {
		return item_type;
	}
	public void setItem_type(String item_type) {
		this.item_type = item_type;
	}
	public Date getItem_time() {
		return item_time;
	}
	public void setItem_time(Date item_time) {
		this.item_time = item_time;
	}
	
	public String getItem_info() {
		return item_info;
	}
	public void setItem_info(String item_info) {
		this.item_info = item_info;
	}
	public String getItem_brand() {
		return item_brand;
	}
	public void setItem_brand(String item_brand) {
		this.item_brand = item_brand;
	}
	public String getItem_image() {
		return item_image;
	}
	public void setItem_image(String item_image) {
		this.item_image = item_image;
	}
	public int getStock_stock() {
		return stock_stock;
	}
	public void setStock_stock(int stock_stock) {
		this.stock_stock = stock_stock;
	}
	
	
}
