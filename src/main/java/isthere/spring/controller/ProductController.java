package isthere.spring.controller;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import isthere.spring.service.ProductService;
import isthere.spring.vo.Product;
 
@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productservice;
     
    @RequestMapping(value="/add", method = RequestMethod.GET)
    public String usercheck(@RequestParam("shopid") int shopid,
    						@RequestParam("price") int price,
    						@RequestParam("name") String name,
    						@RequestParam("code") String code,
    						@RequestParam("type") int type) throws Exception{
    	
    	    	
    	Product product = new Product();
    	product.setShopid(shopid);
    	product.setPrice(price);
    	product.setName(name);
    	product.setCode(code);
    	product.setType(type);
    	
        productservice.addProduct(product);
         
        return "main/index";
    }
}


