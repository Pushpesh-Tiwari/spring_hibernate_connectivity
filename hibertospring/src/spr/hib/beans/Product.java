/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spr.hib.beans;

/**
 *
 * @author DELL
 */
public class Product {
    private int prodId;
    private String prodName;
    private String description;
    private float price;
    private String proCategory;
    private String offer;
    private String brandName;

    public Product() {
    }
    public Product(int prodId, String prodName, String description, float price, String proCategory, String offer, String brandName) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.description = description;
        this.price = price;
        this.proCategory = proCategory;
        this.offer = offer;
        this.brandName = brandName;
    }

    public int getProdId() {
        return prodId;
    }

    /**
     * @param prodId the prodId to set
     */
    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    /**
     * @return the prodName
     */
    public String getProdName() {
        return prodName;
    }

    /**
     * @param prodName the prodName to set
     */
    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * @return the proCategory
     */
    public String getProCategory() {
        return proCategory;
    }

    /**
     * @param proCategory the proCategory to set
     */
    public void setProCategory(String proCategory) {
        this.proCategory = proCategory;
    }

    /**
     * @return the offer
     */
    public String getOffer() {
        return offer;
    }

    /**
     * @param offer the offer to set
     */
    public void setOffer(String offer) {
        this.offer = offer;
    }

    /**
     * @return the brandName
     */
    public String getBrandName() {
        return brandName;
    }

    /**
     * @param brandName the brandName to set
     */
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }  
}
