package isthere.spring.vo;

import java.sql.Timestamp;

public class Shop {
	private Integer shop_id;
	private String shop_name;
	private Float shop_lat;
	private Float shop_lng;
	private String shop_type;
	private Timestamp shop_time;
	private String shop_info;
	private String shop_vendor;
	private Double distance;
	private String shop_soldtop;
	
	public Shop(Float shop_lat, Float shop_lng, Double distance) {
		super();
		this.shop_lat = shop_lat;
		this.shop_lng = shop_lng;
		this.distance = distance;
	}
	public Shop(String shop_name, Float shop_lat, Float shop_lng, String shop_type, String shop_info,
			String shop_vendor, String shop_soldtop) {
		super();
		this.shop_name = shop_name;
		this.shop_lat = shop_lat;
		this.shop_lng = shop_lng;
		this.shop_type = shop_type;
		this.shop_info = shop_info;
		this.shop_vendor = shop_vendor;
		this.shop_soldtop = shop_soldtop;
	}
	
	
	public Shop(Integer shop_id, String shop_name, Float shop_lat, Float shop_lng, String shop_type, Timestamp shop_time,
			String shop_info, String shop_vendor,  String shop_soldtop, Double distance) {
		super();
		this.shop_id = shop_id;
		this.shop_name = shop_name;
		this.shop_lat = shop_lat;
		this.shop_lng = shop_lng;
		this.shop_type = shop_type;
		this.shop_time = shop_time;
		this.shop_info = shop_info;
		this.shop_vendor = shop_vendor;
		this.distance =distance ;
		this.shop_soldtop = shop_soldtop;
	}
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
	public float getShop_lat() {
		return shop_lat;
	}
	public void setShop_lat(float shop_lat) {
		this.shop_lat = shop_lat;
	}
	public float getShop_lng() {
		return shop_lng;
	}
	public void setShop_lng(float shop_lng) {
		this.shop_lng = shop_lng;
	}
	public String getShop_type() {
		return shop_type;
	}
	public void setShop_type(String shop_type) {
		this.shop_type = shop_type;
	}
	public Timestamp getShop_time() {
		return shop_time;
	}
	public void setShop_time(Timestamp shop_time) {
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

	public Double getDistance() {
		return distance;
	}

	public void setDistance(Double distance) {
		this.distance = distance;
	}

	public String getShop_soldtop() {
		return shop_soldtop;
	}

	public void setShop_soldtop(String shop_soldtop) {
		this.shop_soldtop = shop_soldtop;
	}
	
}
