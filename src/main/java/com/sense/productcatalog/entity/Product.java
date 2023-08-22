package com.sense.productcatalog.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private BigDecimal price;

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for description
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Getter and Setter for price
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    // Additional attributes:

    //@Column(name = "category")
    //private String category;

    //@Column(name = "brand")
    //private String brand;

    //@Column(name = "image_urls")
    //@ElementCollection
    //private Set<String> imageUrls;

    // Getters and setters

    //public String getCategory() {
    //    return category;
    //}
    //
    //public void setCategory(String category) {
    //    this.category = category;
    //}

    //public String getBrand() {
    //    return brand;
    //}
    //
    //public void setBrand(String brand) {
    //    this.brand = brand;
    //}

    //public Set<String> getImageUrls() {
    //    return imageUrls;
    //}
    //
    //public void setImageUrls(Set<String> imageUrls) {
    //    this.imageUrls = imageUrls;
    //}

}
