package isthere.spring.mapper;

import java.util.ArrayList;

import isthere.spring.vo.Shop;
import isthere.spring.vo.StockShop;

public interface ShopMapper {
    
    void insertShop(Shop shop);
    void deleteShop(String shop_id);
    ArrayList<Shop> selectShop(Shop shop);
    ArrayList<StockShop> selectStockShop(StockShop stockShop);
}
