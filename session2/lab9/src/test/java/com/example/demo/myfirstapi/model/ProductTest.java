package com.example.demo.myfirstapi.model;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    private Product product;
    private Product product2;
    private Product product3;
    private Product nullProduct;

    @BeforeEach
    void setUp(){
        product = new Product(1L, "Coffee", 69.0);
        product2 = new Product(1L, "Coffee", 69.0);
        product3 = new Product(2L, "Tea", 69.0);
        nullProduct = null;
    }

    @Test
    void getId() {
        long productId = product.getId();
        assertEquals(1L, productId);
    }

    @Test
    void getName() {
        String productName = product.getName();
        assertEquals("Coffee", productName);
    }

    @Test
    void getPrice() {
        double productPrice = product.getPrice();
        assertEquals(69.0, productPrice, 0.0001);
    }

    @Test
    void setId() {
        product.setId(2L);
        long productId = product.getId();
        assertEquals(2L, productId);
    }

    @Test
    void setName() {
        product.setName("Cofveve");
        String productName = product.getName();
        assertEquals("Cofveve", productName);
    }

    @Test
    void setPrice() {
        product.setPrice(420.0);
        double productPrice = product.getPrice();
        assertEquals(420.0, productPrice, 0.0001);
    }

    @Test
    void testToString() {
        String productString = product.toString();
        assertEquals("Product{id=1, name='Coffee', price=69.0}", productString);
    }

    @Test
    void testEqualsSameProduct() {
        boolean equalProduct = product.equals(product2);
        assertTrue(equalProduct);
    }

    @Test
    void testEqualsDifferentProduct() {
        boolean equalProduct = product.equals(product3);
        assertFalse(equalProduct);
    }

    @Test
    void testEqualsNullProduct() {
        boolean equalProduct = product.equals(nullProduct);
        assertFalse(equalProduct);
    }

    @Test
    void testHashCode() {
        int productHash = product.hashCode();
        assertEquals(-6.0749166E8, productHash, 0.0001);
    }
}