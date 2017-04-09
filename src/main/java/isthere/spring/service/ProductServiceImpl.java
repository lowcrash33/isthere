package isthere.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import isthere.spring.dao.ProductDao;
import isthere.spring.vo.Product;
 
@Service
public class ProductServiceImpl implements ProductService{
     
    @Autowired
    private ProductDao productdao;
     
    @Override
    public void addProduct(Product product) throws Exception{
        productdao.addProduct(product);
         
    }
}


