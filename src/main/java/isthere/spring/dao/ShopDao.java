package isthere.spring.dao;

import java.util.ArrayList;

import isthere.spring.vo.Shop;

public interface ShopDao {
    
    public String addShop(Shop shop);
    public ArrayList<Shop> scanShop(int dist);
     
}


