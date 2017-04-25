package isthere.spring.mapper;

import java.util.ArrayList;

import isthere.spring.vo.Item;

public interface ItemMapper {
    
    ArrayList<Item> selectItembyShop(String shop_id);

	ArrayList<Item> itemReserve(int shop_id, String item_name);
	ArrayList<Item> itemSoldTop(int item_limit);
}
