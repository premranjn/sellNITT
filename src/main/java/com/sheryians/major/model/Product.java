package com.sheryians.major.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data

public class Product{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

//    if you add or remove any properties of the product here, same should be done int the DTO section
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", referencedColumnName = "category_id") // merging the table
    private Category category;
    private double price;
    private double weight;

    private String contact;
    private String hostel;
    private String description;
    private String imageName;
}
