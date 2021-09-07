package com.ddd_design.orderexample.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;
import java.util.UUID;

@Table(name = "customer")
@Entity
public class Customer {
    @Id
    private UUID id;

    private List<Order> orders;
}