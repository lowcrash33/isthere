package isthere.spring.controller;
 
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import isthere.spring.service.StockService;
import isthere.spring.vo.Stock;
 
@Controller
@RequestMapping("/stock")
public class StockController {
    @Autowired
	private StockService stockservice;
	
    @RequestMapping("/update")
    public @ResponseBody String scanShop(HttpServletRequest request) throws Exception{
    	Stock stock = setStockVO(request);
    	System.out.println("Action : /stock/update    "  +"Request param : "+ stock.getStock()+", "+ stock.getShop_id() +", "+ stock.getItem_code());
    	
        return stockservice.updateStock(stock); 
    }
    
    private Stock setStockVO(HttpServletRequest request) {
    	Stock setVO = new Stock(request.getParameter("shop_id"), 
    			request.getParameter("item_code"), Integer.parseInt(request.getParameter("stock_count")));
    	return setVO;
    }
}


