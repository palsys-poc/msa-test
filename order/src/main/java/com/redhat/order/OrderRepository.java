package com.redhat.order;

import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "order", path = "orders")
public interface OrderRepository extends PagingAndSortingRepository<Order, Long> {
    List<Order> findByName(@Param("name") String name);

    Order findById(long id);
}
