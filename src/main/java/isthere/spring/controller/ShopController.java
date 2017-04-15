package isthere.spring.controller;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import isthere.spring.service.ShopService;
import isthere.spring.vo.Shop;

@Controller
@RequestMapping("/shop")
public class ShopController {
    @Autowired
    private ShopService shopservice;
     
    @RequestMapping("/add")
    public @ResponseBody String addShop(HttpServletRequest request) throws Exception{
    	Shop shop = setShopVO(request);
    	System.out.println("Request param : "+ shop.getShop_name()+", "+ shop.getShop_type());
    	shopservice.addShop(shop);    	   	
    	return "OK";
    }
    
    @RequestMapping(value="/scan", method = RequestMethod.GET)
    public @ResponseBody ArrayList<Shop> scanShop(@RequestParam("dist") float dist,
    											@RequestParam("lat") Double lat,
    											@RequestParam("lng") Double lng) throws Exception{
    	
    	System.out.println("Request param : "+ dist+", "+lat+", "+lng);
    	
        return shopservice.scanShop(dist); 
    }
    
    
    private Shop setShopVO(HttpServletRequest request) {
    	Shop setVO = new Shop(request.getParameter("shop_name"), 
    			Double.parseDouble(request.getParameter("shop_lat")), 
    			Double.parseDouble(request.getParameter("shop_lng")),
    			request.getParameter("shop_type"), request.getParameter("shop_info"), request.getParameter("shop_vendor"));
    	return setVO;
    }
}
