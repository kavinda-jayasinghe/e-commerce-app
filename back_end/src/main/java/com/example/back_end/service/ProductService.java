package com.example.back_end.service;

import com.example.back_end.dao.ProductDao;
import com.example.back_end.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductDao productDao;

    public Product addNewProduct(Product product) {
       return productDao.save(product);

    }
}
