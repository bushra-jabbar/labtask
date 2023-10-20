package week06assign2;

public class Electronic extends Product {
    private String category;
    private String subCategory;

    public Electronic(int id, String name, double price, int stockQuantity, String category, String subCategory) {
        super(id, name, price, stockQuantity);
        this.category = category;
        this.subCategory = subCategory;
    }


    public String getCategory() {
        return category;
    }

    public String getSubCategory() {
        return subCategory;
    }
}
