package isthere.spring.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import isthere.spring.vo.Product;
 
@Repository
public class ProductDaoImpl implements ProductDao {
    @Autowired
    private SqlSession sqlsession;
     
   
    @Override
    public void addProduct(Product product){
         ProductMapper productMapper = sqlsession.getMapper(ProductMapper.class);
         productMapper.insertProduct(product);
    }
     
}


