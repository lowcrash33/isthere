package isthere.spring.controller;
 
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import isthere.spring.service.ShopService;
import isthere.spring.vo.Shop;
 
@Controller
@RequestMapping("/test")
public class ProductController {
    @Autowired
	private ShopService shopservice;
	
    @RequestMapping(value="/scan", method = RequestMethod.GET)
    public @ResponseBody ArrayList<Shop> test(@RequestParam("dist") float dist) throws Exception{
    
    	System.out.println("Request param : "+ dist);
        return shopservice.scanShop(dist); 
    }
}


