package com.redhat.product;

import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "product", path = "products")
public interface ProductRepository extends PagingAndSortingRepository<Prodcut, Long> {
    List<Prodcut> findByName(@Param("name") String name);

    Prodcut findById(long id);

}
