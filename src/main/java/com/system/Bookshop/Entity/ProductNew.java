package com.system.Bookshop.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "product1")
public class ProductNew {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name ="name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "agent_price")
    private double agent_price;

    @Column(name = "sales_price")
    private double sales_price;

    @Column(name = "reorder_level")
    private int reorder_level;

    @ManyToMany(mappedBy = "products" , fetch = FetchType.LAZY)
    private List<Order> order;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "category", referencedColumnName = "id")
    private Category category;

    @ManyToOne(cascade = CascadeType.ALL )
    @JoinColumn(name = "supplier",referencedColumnName = "id")
    private Supplier supplier;

}
