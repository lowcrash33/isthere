package isthere.spring.dao;

import java.util.ArrayList;

import isthere.spring.vo.Shop;

public interface ShopDao {
    
    public String addShop(Shop shop);
    public ArrayList<Shop> scanShop(String dist, String lat, String lng);
     
}


