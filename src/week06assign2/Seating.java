package week06assign2;

public class Seating  {

    private int loadCapacity; // in pounds

    // Constructor
    public Seating(int loadCapacity) {
        super();

        this.loadCapacity = loadCapacity;
    }

    // Getters and Setters

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return "Seating [  loadCapacity=" + loadCapacity + " lbs]";
    }
}
