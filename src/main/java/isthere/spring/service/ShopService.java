package isthere.spring.service;

import java.util.ArrayList;

import isthere.spring.vo.Shop;

public interface ShopService {
	public String addShop(Shop shop) throws Exception;
	public ArrayList<Shop> scanShop(float dist) throws Exception;

}
