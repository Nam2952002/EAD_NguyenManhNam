package com.example.ead_nguyenmanhnam.controller;

import com.example.ead_nguyenmanhnam.entity.StockEntity;
import com.example.ead_nguyenmanhnam.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
public class WebController {

   @Autowired
   StockService stockService;

    @GetMapping("/index")
    public String index(Model model) {
        List<StockEntity> stock = stockService.getAllStock();
        model.addAttribute("stock", stock);
        return "index";
    }

    public List<Double> getStockPrice(String symbol){
        List<Double> result = stockService.findPriceBySymbol(symbol);
        return result;
    }

    public List<String> getStockName(String symbol){
        List<String> result = stockService.findNameBySymbol(symbol);
        return result;
    }
}
