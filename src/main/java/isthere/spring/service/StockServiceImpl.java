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
    public String updateStock(Stock stock) throws Exception{
    	return stockdao.updateStock(stock);
    }
}


