package com.redhat.product;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

public class ProductService implements IProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public Optional<Product> findById(long id) {
        Optional<Product> product = productRepository.findById(id);
        Product prod = new Product();
        product.ifPresent(st -> prod.setId(st.getId()));
        // prod.setId(product.getId());
        product.ifPresent(st -> prod.setName("\n" + st.getName()));
        product.ifPresent(st -> prod.setContent("\n" + st.getContent()));
        return Optional.ofNullable(prod);
    }
}
