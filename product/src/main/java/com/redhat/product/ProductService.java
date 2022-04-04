package com.redhat.product;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

public class ProductService implements IProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public String findById(long id) {
        Product product = productRepository.findById(id);
        return product.toString();
    }
}
