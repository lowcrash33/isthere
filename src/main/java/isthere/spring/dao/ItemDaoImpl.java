package isthere.spring.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import isthere.spring.mapper.ItemMapper;
import isthere.spring.vo.Item;
 
@Repository
public class ItemDaoImpl implements ItemDao {
    @Autowired
    private SqlSession sqlsession;
     
   
    @Override
    public ArrayList<Item> scanItembyShop(String shop_id){
    	 ItemMapper itemMapper = sqlsession.getMapper(ItemMapper.class);
    	 return itemMapper.selectItembyShop(shop_id); 
    }
    @Override
    public ArrayList<Item> itemSoldTop(String item_limit){
    	ItemMapper itemMapper = sqlsession.getMapper(ItemMapper.class);
    	return itemMapper.itemSoldTop(Integer.valueOf(item_limit)); 
    }
    @Override
    public ArrayList<Item> itemResv(int shop_id, String item_name){
    	ItemMapper itemMapper = sqlsession.getMapper(ItemMapper.class);
    	return itemMapper.itemReserve(shop_id, item_name); 
    }
     
}


