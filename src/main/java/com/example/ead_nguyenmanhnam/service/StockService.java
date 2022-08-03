package com.example.ead_nguyenmanhnam.service;

import com.example.ead_nguyenmanhnam.entity.StockEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface StockService {
    List<StockEntity> getAllStock();

    List<String> findNameBySymbol(String symbol);


    List<Double> findPriceBySymbol(String symbol);


    List<StockEntity> search(String name);

}
