package week06assign2;

public class Laptop  {
    private String processor;
    private int RAMSize; // in gigabytes
    private String screenDimension;

    // Constructor
    public Laptop(String processor, int RAMSize, String screenDimension) {
        super();
        this.processor = processor;
        this.RAMSize = RAMSize;
        this.screenDimension = screenDimension;
    }

    // Getters and Setters
    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getRAMSize() {
        return RAMSize;
    }

    public void setRAMSize(int RAMSize) {
        this.RAMSize = RAMSize;
    }

    public String getScreenDimension() {
        return screenDimension;
    }

    public void setScreenDimension(String screenDimension) {
        this.screenDimension = screenDimension;
    }

    @Override
    public String toString() {
        return "Laptop [processor=" + processor + ", RAMSize=" + RAMSize + "GB, screenDimension=" + screenDimension + "]";
    }
}