package com.ddd_design.orderexample.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Table(name = "product")
@Entity
public class Product {
    @Id
    private UUID id;
}