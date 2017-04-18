package isthere.spring.dao;

import java.util.ArrayList;

import isthere.spring.vo.Item;

public interface ItemDao {
    

    public ArrayList<Item> scanItembyShop(String shop_id);
     
}


