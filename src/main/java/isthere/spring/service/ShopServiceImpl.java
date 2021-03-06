package isthere.spring.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import isthere.spring.dao.ShopDao;
import isthere.spring.vo.Shop;
import isthere.spring.vo.StockShop;
 
@Service
public class ShopServiceImpl implements ShopService{
     
    @Autowired
    private ShopDao shopdao;
     
    @Override
    public String addShop(Shop shop) throws Exception{
    	return shopdao.addShop(shop);   
    }
    @Override
    public void deleteShop(String shop_id){
    	shopdao.deleteShop(shop_id);   
    }
    @Override
    public ArrayList<Shop> scanShop(Shop shop) throws Exception{
    	return shopdao.scanShop(shop);   
    }
    @Override
    public ArrayList<StockShop> selectStockShop(StockShop stockShop){
    	return shopdao.selectStockShop(stockShop);   
    }
}


