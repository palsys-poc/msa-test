package com.redhat.order;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long uid; // user id (Person.class)
    private Long pid; // product id (Product.class)

    protected Order() {
    }

    public Order(Long uid, Long pid) {
        this.uid = uid;
        this.pid = pid;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, name='%d', address='%d']",
                id, uid, pid);
    }

    public Long getId() {
        return id;
    }

    public Long getUid() {
        return uid;
    }

    public Long getPid() {
        return pid;
    }
}
