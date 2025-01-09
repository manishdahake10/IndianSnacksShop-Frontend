package com.ts.DTO;

public class ProductDTO {

    private Long productId;
    private String productName;
    private String description;
    private double price;
    private String productImage;
    private double rating;

    public ProductDTO(Long id, String name, String description, double price, String imageUrl, double rating) {
    	this.productId = id;
        this.productName = name;
        this.description = description;
        this.price = price;
        this.productImage = imageUrl;
        this.rating = rating;
    }

	// Getters and Setters
    public Long getId() {
        return productId;
    }

    public void setId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
