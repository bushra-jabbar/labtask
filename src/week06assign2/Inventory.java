package week06assign2;

import java.util.List;

public class Inventory {
    private Product[] products;
    private int productCount;

    public Inventory(int capacity) {
        products = new Product[capacity];
        productCount = 0;
    }

    public void addProduct(Product product) {
        if (productCount < products.length) {
            products[productCount] = product;
            productCount++;
        } else {
            System.out.println("Inventory is full. Cannot add more products.");
        }
    }

    public void updateProduct(Product updatedProduct) {
        for (int i = 0; i < productCount; i++) {
            if (products[i].getId() == updatedProduct.getId()) {
                products[i] = updatedProduct;
                return;
            }
        }
    }

    public void removeProduct(int productId) {
        for (int i = 0; i < productCount; i++) {
            if (products[i].getId() == productId) {
                for (int j = i; j < productCount - 1; j++) {
                    products[j] = products[j + 1];
                }
                products[productCount - 1] = null;
                productCount--;
                return;
            }
        }
    }

    public Product getProduct(int productId) {
        for (int i = 0; i < productCount; i++) {
            if (products[i].getId() == productId) {
                return products[i];
            }
        }
        return null;
    }
}
