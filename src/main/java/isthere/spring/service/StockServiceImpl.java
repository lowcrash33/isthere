package isthere.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import isthere.spring.dao.StockDao;
import isthere.spring.vo.Stock;
 
@Service
public class StockServiceImpl implements StockService{
     
    @Autowired
    private StockDao stockdao;
     
    @Override
    public int updateStock(Stock stock) throws Exception{
    	return stockdao.updateStock(stock);
    }
    
    @Override
    public String selectStock(Stock stock) throws Exception{
    	return stockdao.selectStock(stock);
    }
    @Override
    public String insertStock(Stock stock) throws Exception{
    	return stockdao.insertStock(stock);
    }
}


