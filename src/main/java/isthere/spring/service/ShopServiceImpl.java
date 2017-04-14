package isthere.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import isthere.spring.dao.ShopDao;
import isthere.spring.vo.Shop;
 
@Service
public class ShopServiceImpl implements ShopService{
     
    @Autowired
    private ShopDao shopdao;
     
    @Override
    public void addShop(Shop shop) throws Exception{
    	shopdao.addShop(shop);
         
    }
}


