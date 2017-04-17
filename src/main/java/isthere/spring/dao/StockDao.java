package isthere.spring.dao;

import isthere.spring.vo.Stock;

public interface StockDao {
    
    public int updateStock(Stock stock);
    public String selectStock(Stock stock);
    public String insertStock(Stock stock);
}


