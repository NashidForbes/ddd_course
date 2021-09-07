package com.ddd_design.orderexample.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Table(name = "order")
@Builder
@Entity
public class Order {
    @Id
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "customers_id")
    private Customer customers;
    @ManyToOne
    @JoinColumn(name = "products_id")
    private Product products;

    public Customer getCustomers() {
        return customers;
    }

    public void setCustomers(Customer customers) {
        this.customers = customers;
    }

    public Product getProducts() {
        return products;
    }

    public void setProducts(Product products) {
        this.products = products;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}