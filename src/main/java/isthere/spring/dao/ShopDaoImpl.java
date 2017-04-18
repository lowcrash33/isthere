package isthere.spring.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import isthere.spring.mapper.ShopMapper;
import isthere.spring.vo.Shop;
import isthere.spring.vo.StockShop;
 
@Repository
public class ShopDaoImpl implements ShopDao {
    @Autowired
    private SqlSession sqlsession;
     
   
    @Override
    public String addShop(Shop shop){
    	 ShopMapper shopMapper = sqlsession.getMapper(ShopMapper.class);
    	 shopMapper.insertShop(shop);
    	 return "OK"; 
    }
    @Override
    public ArrayList<Shop> scanShop(String dist, String lat, String lng){
    	 ShopMapper shopMapper = sqlsession.getMapper(ShopMapper.class);
    	 return shopMapper.selectShop(dist, lat, lng);
    	 
    }
    
    @Override
    public ArrayList<StockShop> selectStockShop(StockShop stockShop){
    	 ShopMapper shopMapper = sqlsession.getMapper(ShopMapper.class);
    	 return shopMapper.selectStockShop(stockShop);
    	 
    }
     
}


