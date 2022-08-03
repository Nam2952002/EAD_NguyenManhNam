package com.example.ead_nguyenmanhnam.service;

import com.example.ead_nguyenmanhnam.entity.StockEntity;
import com.example.ead_nguyenmanhnam.repository.StockRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
public class StockServiceImpl implements StockService{
    @Autowired
    StockRepo stockRepo;



    @Override
    public List<StockEntity> getAllStock() {
        return stockRepo.findAll();
    }

    @Override
    public List<String> findNameBySymbol(String symbol) {
        return stockRepo.findNameBySymbol(symbol);
    }

    @Override
    public List<Double> findPriceBySymbol(String symbol) {
        return stockRepo.findPriceBySymbol(symbol);
    }

    @Override
    public List<StockEntity> search(String name) {
        return null;
    }


}
