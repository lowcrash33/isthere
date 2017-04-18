package isthere.spring.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import isthere.spring.service.ItemService;
import isthere.spring.vo.Item;

@Controller
@RequestMapping("/item")
public class ItemController {
    @Autowired
    private ItemService itemservice;
    
    @RequestMapping("/shopItemList")
    public @ResponseBody ArrayList<Item> addShop(HttpServletRequest request) throws Exception{
    	String shop_id = request.getParameter("shop_id");
    	System.out.println("Action : /item/scanbyshop   Request param : "+ shop_id);
    	return itemservice.scanItembyShop(shop_id);  
    }
       
}