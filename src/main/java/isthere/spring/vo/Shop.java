package isthere.spring.vo;

import java.sql.Date;

public class Shop {
	private int shop_id;
	private String shop_name;
	private double shop_lat;
	private double shop_lng;
	private String shop_type;
	private Date shop_time;
	private String shop_info;
	private String shop_vendor;
	public int getShop_id() {
		return shop_id;
	}
	public void setShop_id(int shop_id) {
		this.shop_id = shop_id;
	}
	public String getShop_name() {
		return shop_name;
	}
	public void setShop_name(String shop_name) {
		this.shop_name = shop_name;
	}
	public double getShop_lat() {
		return shop_lat;
	}
	public void setShop_lat(double shop_lat) {
		this.shop_lat = shop_lat;
	}
	public double getShop_lng() {
		return shop_lng;
	}
	public void setShop_lng(double shop_lng) {
		this.shop_lng = shop_lng;
	}
	public String getShop_type() {
		return shop_type;
	}
	public void setShop_type(String shop_type) {
		this.shop_type = shop_type;
	}
	public Date getShop_time() {
		return shop_time;
	}
	public void setShop_time(Date shop_time) {
		this.shop_time = shop_time;
	}
	public String getShop_info() {
		return shop_info;
	}
	public void setShop_info(String shop_info) {
		this.shop_info = shop_info;
	}
	public String getShop_vendor() {
		return shop_vendor;
	}
	public void setShop_vendor(String shop_vendor) {
		this.shop_vendor = shop_vendor;
	}
	
}
