package isthere.spring.mapper;

import java.util.ArrayList;

import isthere.spring.vo.Item;

public interface ItemMapper {
    
    ArrayList<Item> selectItembyShop(String shop_id);
}
