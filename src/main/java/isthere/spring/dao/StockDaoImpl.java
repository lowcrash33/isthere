package isthere.spring.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import isthere.spring.mapper.StockMapper;
import isthere.spring.vo.Stock;
 
@Repository
public class StockDaoImpl implements StockDao {
    @Autowired
    private SqlSession sqlsession;
     
   
    @Override
    public String updateStock(Stock stock){
         StockMapper stockMapper = sqlsession.getMapper(StockMapper.class);
         String stockStr = selectStock(stock);
         
         //기존 재고 정보가 있으면 재고객체 업데이트 후 update
         if(stockStr != null){
        	int stockCnt = Integer.parseInt(stockStr);
            stock.setStock(stock.getStock() + stockCnt);
            return stockMapper.updateStock(stock); 
         }else{
            return stockMapper.insertStock(stock); 
         }
    }
    @Override
    public String selectStock(Stock stock){
         StockMapper stockMapper = sqlsession.getMapper(StockMapper.class);        
         return stockMapper.selectStock(stock);
    }
    @Override
    public String insertStock(Stock stock){
         StockMapper stockMapper = sqlsession.getMapper(StockMapper.class);
         return stockMapper.insertStock(stock);
    }
     
}


