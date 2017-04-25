package isthere.spring.dao;

import java.util.ArrayList;

import isthere.spring.vo.Shop;
import isthere.spring.vo.StockShop;

public interface ShopDao {
    
    public String addShop(Shop shop);
    public void deleteShop(String shop_id);
    public ArrayList<Shop> scanShop(Shop shop);
	ArrayList<StockShop> selectStockShop(StockShop stockShop);
     
}


