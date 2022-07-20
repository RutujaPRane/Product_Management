package com.example.Product_Management.Entity;

public class Product {
    private String group;
    private String barcode;
    private String category;
    private String subCategory;
    private String itemName;
    private String imageUrl;
    private String type;
    private Long price1;
    private Long qty1;
    private Long mrp1;
    private String unit1;

    public Product() {
    }

    public Product(String group, String barcode, String category, String subCategory, String itemName, String imageUrl, String type, Long price1, Long qty1, Long mrp1, String unit1) {
        this.group = group;
        this.barcode = barcode;
        this.category = category;
        this.subCategory = subCategory;
        this.itemName = itemName;
        this.imageUrl = imageUrl;
        this.type = type;
        this.price1 = price1;
        this.qty1 = qty1;
        this.mrp1 = mrp1;
        this.unit1 = unit1;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getPrice1() {
        return price1;
    }

    public void setPrice1(Long price1) {
        this.price1 = price1;
    }

    public Long getQty1() {
        return qty1;
    }

    public void setQty1(Long qty1) {
        this.qty1 = qty1;
    }

    public Long getMrp1() {
        return mrp1;
    }

    public void setMrp1(Long mrp1) {
        this.mrp1 = mrp1;
    }

    public String getUnit1() {
        return unit1;
    }

    public void setUnit1(String unit1) {
        this.unit1 = unit1;
    }

    @Override
    public String toString() {
        return "Product{" +
                "group='" + group + '\'' +
                ", barcode='" + barcode + '\'' +
                ", category='" + category + '\'' +
                ", subCategory='" + subCategory + '\'' +
                ", itemName='" + itemName + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", type='" + type + '\'' +
                ", price1=" + price1 +
                ", qty1=" + qty1 +
                ", mrp1=" + mrp1 +
                ", unit1='" + unit1 + '\'' +
                '}';
    }
}




