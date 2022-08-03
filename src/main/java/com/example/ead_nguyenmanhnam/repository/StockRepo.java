package com.example.ead_nguyenmanhnam.repository;

import com.example.ead_nguyenmanhnam.entity.StockEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
public interface StockRepo extends JpaRepository<StockEntity, Integer> {

    List<StockEntity> findAll(String name);

    @Query("select name from StockEntity where symbol like %:name%")
    List<String> findNameBySymbol(String symbol);


    @Query("select price from StockEntity where symbol like %:price%")
    List<Double> findPriceBySymbol(String symbol);

}
