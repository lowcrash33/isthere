package isthere.spring.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import isthere.spring.service.ShopService;
import isthere.spring.vo.Shop;

@Controller
@RequestMapping("/shop")
public class ShopController {
    @Autowired
    private ShopService shopservice;
     
    @RequestMapping(value="/add", method = RequestMethod.POST)
    public String addShop(@ModelAttribute Shop shop) throws Exception{
    	
    	System.out.printf("***" + shop);
    	shopservice.addShop(shop);
    	return "home";
    }
    
    @RequestMapping("/android3")
    @ResponseBody
    public Map<String, String> androidTestWithRequestAndResponse(HttpServletRequest request){
        System.out.println(request.getParameter("title"));
        System.out.println(request.getParameter("memo"));
        
        Map<String, String> result = new HashMap<String, String>();
        result.put("data1", "server first memo");
        result.put("data2", "sevver second memo");
        
        return result;
    }

}
