package com.redhat.person;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String address;

    protected Customer() {
    }

    public Customer(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, name='%s', address='%s']",
                id, name, address);
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
