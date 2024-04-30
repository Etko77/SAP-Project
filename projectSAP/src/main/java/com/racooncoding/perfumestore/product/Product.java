package com.racooncoding.perfumestore.product;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "Products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productId;
    private String productName;
    @Enumerated(EnumType.STRING)
    @Column(name = "type")
    private ProductType productType;
    @Column(name = "quantity")
    private Integer productQuantity;
    @Column(name = "price", precision = 10, scale = 2, nullable = true)
    private BigDecimal productPrice;
    @Column(name = "description")
    private String productDescription;
    @Column(name = "image_url")
    private String productImageUrl;

    public Product() {
    }

    public Product(String productDescription,
                   BigDecimal productPrice,
                   String productName,
                   ProductType productType,
                   Integer productQuantity,
                   String imageUrl) {
        this.productName = productName;
        this.productType = productType;
        this.productQuantity = productQuantity;
        this.productPrice = productPrice;
        this.productDescription = productDescription;
        this.productImageUrl = imageUrl;
    }

    public Product(Integer productId,
                   String productName,
                   ProductType productType,
                   Integer productQuantity,
                   BigDecimal productPrice,
                   String productDescription,
                   String imageUrl) {
        this.productId = productId;
        this.productName = productName;
        this.productType = productType;
        this.productQuantity = productQuantity;
        this.productPrice = productPrice;
        this.productDescription = productDescription;
        this.productImageUrl = imageUrl;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public Integer getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(Integer productQuantity) {
        this.productQuantity = productQuantity;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductImageUrl() {
        return productImageUrl;
    }

    public void setProductImageUrl(String productImageUrl) {
        this.productImageUrl = productImageUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(productId, product.productId) && Objects.equals(productName, product.productName) && productType == product.productType && Objects.equals(productQuantity, product.productQuantity) && Objects.equals(productPrice, product.productPrice) && Objects.equals(productDescription, product.productDescription) && Objects.equals(productImageUrl, product.productImageUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, productName, productType, productQuantity, productPrice, productDescription, productImageUrl);
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productType=" + productType +
                ", productQuantity=" + productQuantity +
                ", productPrice=" + productPrice +
                ", productDescription='" + productDescription + '\'' +
                ", imageUrl='" + productImageUrl + '\'' +
                '}';
    }
}
