package isthere.spring.service;

import isthere.spring.vo.Stock;

public interface StockService {
    
    public int updateStock(Stock stock) throws Exception;

	public String selectStock(Stock stock) throws Exception;

	public String insertStock(Stock stock) throws Exception;
     
}


