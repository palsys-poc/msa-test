package com.redhat.product;

import java.util.Optional;

public interface IProductService {
    Optional<Product> findById(long id);
}
