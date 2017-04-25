package isthere.spring.service;

import java.util.ArrayList;

import isthere.spring.vo.Shop;
import isthere.spring.vo.StockShop;

public interface ShopService {
	public String addShop(Shop shop) throws Exception;
	public void deleteShop(String shop_id);
	public ArrayList<Shop> scanShop(Shop shop) throws Exception;
	public ArrayList<StockShop> selectStockShop(StockShop stockShop);

}
