package isthere.spring.dao;

import java.util.ArrayList;

import isthere.spring.vo.Shop;
import isthere.spring.vo.StockShop;

public interface ShopDao {
    
    public String addShop(Shop shop);
    public ArrayList<Shop> scanShop(String dist, String lat, String lng);
	ArrayList<StockShop> selectStockShop(StockShop stockShop);
     
}


