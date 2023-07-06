package com.example.back_end.dao;

import com.example.back_end.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ProductDao extends CrudRepository<Product,Integer> {
}
