package isthere.spring.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import isthere.spring.dao.ShopDao;
import isthere.spring.vo.Shop;
 
@Service
public class ShopServiceImpl implements ShopService{
     
    @Autowired
    private ShopDao shopdao;
     
    @Override
    public String addShop(Shop shop) throws Exception{
    	return shopdao.addShop(shop);   
    }
    @Override
    public ArrayList<Shop> scanShop(String dist, String lat, String lng) throws Exception{
    	return shopdao.scanShop(dist, lat, lng);   
    }
}


