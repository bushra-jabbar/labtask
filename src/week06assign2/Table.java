package week06assign2;

public class Table {  private String shape;

    // Constructor
    public Table(String shape, String material, String dimension) {
        this.shape = shape;

    }

    // Getters and Setters
    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }



    @Override
    public String toString() {
        return "Table [shape=" + shape +  "]";
    }
}
