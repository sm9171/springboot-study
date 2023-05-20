package com.springboot.hello.repository;

import com.springboot.hello.data.entity.Product;
import com.springboot.hello.data.repository.ProductRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class ProductRepositoryTestByH2 {

    @Autowired
    private ProductRepository productRepository;

    @Test
    void saveTest() {
        //given
        Product product = new Product();
        product.setName("펜");
        product.setPrice(1000);
        product.setStock(1000);

        //when
        Product savedProduct = productRepository.save(product);

        //then
        Assertions.assertEquals(product.getName(), savedProduct.getName());
        Assertions.assertEquals(product.getName(), savedProduct.getName());
        Assertions.assertEquals(product.getName(), savedProduct.getName());
    }
}
