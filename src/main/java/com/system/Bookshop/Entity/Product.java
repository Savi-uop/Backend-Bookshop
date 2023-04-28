package com.system.Bookshop.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.Date;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "product1")
@Table(name = "product1")
@Inheritance(strategy = InheritanceType.JOINED)
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name ="name")
    private String name;

    @Column(name = "description")
    private String description;

//    @Column(name = "image1")
//    private String image1;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "agent_price")
    private double agent_price;

    @Column(name = "sales_price")
    private double sales_price;

    @Column(name = "reorder_level")
    private int reorder_level;

//    @CreationTimestamp
//    @Temporal(TemporalType.TIMESTAMP)
//    @Column(name = "dateAdded")
//    private Date dateAdded;

    //Mapping starts here

//    working
    @ManyToMany(mappedBy = "products" , fetch = FetchType.LAZY)
    private List<Order> order;


    //working one
    @ManyToOne(cascade = CascadeType.ALL)
//    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "category", referencedColumnName = "id")
    private Category category;




//    @ManyToOne(fetch =FetchType.LAZY )

    // working example
//    @ManyToOne(cascade = CascadeType.ALL)
//    @JsonIgnore
//    @JoinColumn(name = "supplier" , referencedColumnName = "id")
//    private Supplier supplier;

    // this is workig dont change
    @ManyToOne(cascade = CascadeType.ALL )
    @JoinColumn(name = "supplier",referencedColumnName = "id")
    private Supplier supplier;





//    @Transient
//    public String getImage1Path() {
//        if (image1 == null)
//        return null;
//        return "/product-photos" + id + "/" + image1;
//    }

//    public String getImage1() {
//        return image1;
//    }


    }
