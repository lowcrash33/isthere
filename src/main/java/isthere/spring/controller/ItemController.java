package isthere.spring.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import isthere.spring.service.ItemService;
import isthere.spring.vo.Item;

@Controller
@RequestMapping("/item")
public class ItemController {
	private static final Logger logger = LoggerFactory.getLogger(ItemController.class);
    @Autowired
    private ItemService itemservice;
    
    @RequestMapping("/addItem")
    public @ResponseBody String addItem(HttpServletRequest request) throws Exception{
    	String shop_id = request.getParameter("shop_id");
    	logger.info("Action : /item/addItem   Request param : "+ shop_id);
    	return "OK";  
    }
    
    @RequestMapping("/shopItemList")
    public @ResponseBody ArrayList<Item> listItem(HttpServletRequest request) throws Exception{
    	String shop_id = request.getParameter("shop_id");
    	logger.info("Action : /item/scanbyshop   Request param : "+ shop_id);
    	return itemservice.scanItembyShop(shop_id);  
    }
    @RequestMapping("/itemSoldTop")
    public @ResponseBody ArrayList<Item> itemSoldTop(HttpServletRequest request) throws Exception{
    	String item_limit = request.getParameter("item_limit");
    	logger.info("Action : /item/itemSoldTop   Request param : "+ item_limit);
    	return itemservice.itemSoldTop(item_limit);  
    }
    @RequestMapping("/itemResv")
    public @ResponseBody ArrayList<Item> itemResv(HttpServletRequest request) throws Exception{
    	int shop_id = Integer.valueOf(request.getParameter("shop_id"));
    	String item_name = request.getParameter("item_name");
    	logger.info("Action : /item/itemResv   Request param : "+ shop_id + " " + item_name);
    	return itemservice.itemResv(shop_id,item_name);  
    }
       
}