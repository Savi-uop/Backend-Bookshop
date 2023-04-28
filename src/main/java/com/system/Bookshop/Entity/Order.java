package com.system.Bookshop.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.cglib.core.Local;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name = "orders")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Order{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "amount")
    private double amount;

    @Column(name = "type")
    private  String type;

    @Column(name = "order_date")
    private Date order_date;
//    LocalDate date = LocalDate.now();

    @Column(name = "order_time")
    private Time order_time;
//    LocalTime time = LocalTime.now();

//    working

    @JsonIgnore
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "order_product",
        joinColumns = @JoinColumn(name = "order_id",referencedColumnName = "id"),
                inverseJoinColumns = @JoinColumn(name = "product_id",referencedColumnName = "id"))

    private List<Product> products;





}
