package com.example.demo.myfirstapi.repository;

import com.example.demo.myfirstapi.model.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {
    private ProductRepository productRepository;
    private List<Product> products;
    private AtomicLong nextId = new AtomicLong(1);

    @BeforeEach
    void setUp(){
        nextId = new AtomicLong(1);
        productRepository = new ProductRepository();
        products = Collections.synchronizedList(new ArrayList<>());
        products.add(new Product(nextId.getAndIncrement(), "Laptop", 1200.00));
        products.add(new Product(nextId.getAndIncrement(), "Mouse", 25.50));
        products.add(new Product(nextId.getAndIncrement(), "Keyboard", 75.00));
    }

    @Test
    void findAll() {
        List<Product> productList = productRepository.findAll();

        assertEquals(3, productList.size());
        assertEquals("Laptop", productList.get(0).getName());
        assertEquals("Mouse", productList.get(1).getName());
        assertEquals("Keyboard", productList.get(2).getName());
    }

    @Test
    void findById() {
        Optional<Product> productSearch = productRepository.findById(1L);
        assertEquals("Optional[Product{id=1, name='Laptop', price=1200.0}]",productSearch.toString());
    }

    @Test
    void save() {
    }
}