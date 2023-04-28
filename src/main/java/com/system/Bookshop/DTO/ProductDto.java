package com.system.Bookshop.DTO;

import com.system.Bookshop.Entity.Category;
import com.system.Bookshop.Entity.Supplier;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductDto {

    private int id;
    private String name;
    private String description;
    private int category;
    private int quantity;
    private double agent_price;
    private double sales_price;
    private int reorder_level;
    private int supplier;


}
