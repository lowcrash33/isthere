package isthere.spring.service;

import java.util.ArrayList;

import isthere.spring.vo.Shop;
import isthere.spring.vo.StockShop;

public interface ShopService {
	public String addShop(Shop shop) throws Exception;
	public ArrayList<Shop> scanShop(String dist, String lat, String lng) throws Exception;
	public ArrayList<StockShop> selectStockShop(StockShop stockShop);

}
