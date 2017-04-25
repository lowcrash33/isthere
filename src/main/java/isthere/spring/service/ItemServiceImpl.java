package isthere.spring.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import isthere.spring.dao.ItemDao;
import isthere.spring.dao.ShopDao;
import isthere.spring.vo.Item;
import isthere.spring.vo.Shop;
 
@Service
public class ItemServiceImpl implements ItemService{
     
    @Autowired
    private ItemDao itemdao;
     
    @Override
    public ArrayList<Item> scanItembyShop(String shop_id) throws Exception{
    	return itemdao.scanItembyShop(shop_id);   
    }
    @Override
    public ArrayList<Item> itemSoldTop(String item_limit){
    	return itemdao.itemSoldTop(item_limit);   
    }
    @Override
    public ArrayList<Item> itemResv(int shop_id, String item_name){
    	return itemdao.itemResv(shop_id, item_name);   
    }
    
}


