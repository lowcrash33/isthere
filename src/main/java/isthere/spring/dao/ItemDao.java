package isthere.spring.dao;

import java.util.ArrayList;

import isthere.spring.vo.Item;

public interface ItemDao {
    

    public ArrayList<Item> scanItembyShop(String shop_id);

	public ArrayList<Item> itemResv(int shop_id, String item_name);

	public ArrayList<Item> itemSoldTop(String item_limit);
     
}


