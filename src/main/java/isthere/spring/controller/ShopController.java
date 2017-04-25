package isthere.spring.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import isthere.spring.service.ShopService;
import isthere.spring.vo.StockShop;
import isthere.spring.vo.Shop;

@Controller
@RequestMapping("/shop")
public class ShopController {
	private static final Logger logger = LoggerFactory.getLogger(ShopController.class);
    @Autowired
    private ShopService shopservice;
     
    @RequestMapping("/add")
    public @ResponseBody String addShop(HttpServletRequest request) throws Exception{
    	Shop shop = setShopVO(request);
    	logger.info("Action : /shop/add Request param : "+ shop.getShop_name()+", "+ shop.getShop_type());
    	shopservice.addShop(shop);    	   	
    	return "OK";
    }
    @RequestMapping("/delete")
    public @ResponseBody String deleteShop(HttpServletRequest request) throws Exception{
    	String shop_id = request.getParameter("shop_id");
    	logger.info("Action : /shop/add Request param : "+ shop_id);
    	shopservice.deleteShop(shop_id);    	   	
    	return "OK";
    }
    
    @RequestMapping("/scan")
    public @ResponseBody ArrayList<Shop> scanShop(HttpServletRequest request) throws Exception{
    	Shop shop = new Shop(Float.valueOf(request.getParameter("lat")),
    			Float.valueOf(request.getParameter("lng")),Double.valueOf(request.getParameter("dist")));
    	logger.info("Action : /shop/scan");
        return shopservice.scanShop(shop); 
    }
    
    @RequestMapping("/scanByItem")
    public @ResponseBody ArrayList<StockShop> scanByItem(HttpServletRequest request) throws Exception{
    	StockShop stockShop = new StockShop();
    	stockShop.setItem_code(request.getParameter("item_name"));
    	stockShop.setShop_lat(request.getParameter("shop_lat"));
    	stockShop.setShop_lng(request.getParameter("shop_lng"));
    	stockShop.setDistance(request.getParameter("distance"));
    	logger.info("Action : /shop/scanByItem   "
    			+ "Request param : "+ stockShop.getItem_code()+", "+stockShop.getShop_lat()+", "+stockShop.getShop_lng()+", "+stockShop.getDistance());
        return shopservice.selectStockShop(stockShop);
    }
    
    
    private Shop setShopVO(HttpServletRequest request) {
    	Shop setVO = new Shop(request.getParameter("shop_name"), 
    			Float.valueOf(request.getParameter("shop_lat")), 
    			Float.valueOf(request.getParameter("shop_lng")),
    			request.getParameter("shop_type"), request.getParameter("shop_info"), request.getParameter("shop_vendor"), null);
    	return setVO;
    }
}
