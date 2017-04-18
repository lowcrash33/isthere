package isthere.spring.mapper;

import java.util.ArrayList;

import isthere.spring.vo.Shop;
import isthere.spring.vo.StockShop;

public interface ShopMapper {
    
    void insertShop(Shop shop);
    ArrayList<Shop> selectShop(String dist, String lat, String lng);
    ArrayList<StockShop> selectStockShop(StockShop stockShop);
}
