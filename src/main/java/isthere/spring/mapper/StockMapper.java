package isthere.spring.mapper;

import isthere.spring.vo.Stock;

public interface StockMapper {
    
    String updateStock(Stock stock);

	String selectStock(Stock stock);

	String insertStock(Stock stock);
     
}
