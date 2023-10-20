package week06assign2;

import java.util.Date;

public class Grocery extends Product {
    private String category;
    private String subCategory;

    public Grocery(int id, String name, double price, int stockQuantity, String category, String subCategory) {
        super(id, name, price, stockQuantity);
        this.category = category;
        this.subCategory = subCategory;
    }

    public String getCategory() {
        return category;
    }

    public String getSubCategory() {
        return subCategory;
    }}