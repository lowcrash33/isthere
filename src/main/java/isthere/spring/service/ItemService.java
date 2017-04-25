package isthere.spring.service;

import java.util.ArrayList;

import isthere.spring.vo.Item;

public interface ItemService {
	public ArrayList<Item> scanItembyShop(String shop_id) throws Exception;

	public ArrayList<Item> itemResv(int shop_id, String item_name);

	public ArrayList<Item> itemSoldTop(String item_limit);

}
