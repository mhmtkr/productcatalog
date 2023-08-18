package com.sense.productcatalog.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

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

    // Additional attributes:

    //@Column(name = "sku")
    //private String sku;

    //@Column(name = "category")
    //private String category;

    //@Column(name = "brand")
    //private String brand;

    //@Column(name = "image_urls")
    //@ElementCollection
    //private Set<String> imageUrls;

    //@Column(name = "average_rating")
    //private Double averageRating;

    //@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    //@JoinColumn(name = "product_id")
    //private List<Review> reviews;

    // Add other necessary attributes

    // Include getters and setters

    // Example of implementing additional attributes:

    // SKU (Stock Keeping Unit)
    // Un-comment the following and define the appropriate mapping

    //public String getSku() {
    //    return sku;
    //}
    //
    //public void setSku(String sku) {
    //    this.sku = sku;
    //}

    // Category
    // Un-comment the following and define the appropriate mapping

    //public String getCategory() {
    //    return category;
    //}
    //
    //public void setCategory(String category) {
    //    this.category = category;
    //}

    // Brand
    // Un-comment the following and define the appropriate mapping

    //public String getBrand() {
    //    return brand;
    //}
    //
    //public void setBrand(String brand) {
    //    this.brand = brand;
    //}

    // Images
    // Un-comment the following and define the appropriate mapping

    //public Set<String> getImageUrls() {
    //    return imageUrls;
    //}
    //
    //public void setImageUrls(Set<String> imageUrls) {
    //    this.imageUrls = imageUrls;
    //}

    // Reviews and Ratings
    // Un-comment the following and define the appropriate mapping

    //public Double getAverageRating() {
    //    return averageRating;
    //}
    //
    //public void setAverageRating(Double averageRating) {
    //    this.averageRating = averageRating;
    //}

    //public List<Review> getReviews() {
    //    return reviews;
    //}
    //
    //public void setReviews(List<Review> reviews) {
    //    this.reviews = reviews;
    //}
}
