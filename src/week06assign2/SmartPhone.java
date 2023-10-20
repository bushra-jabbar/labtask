package week06assign2;

public class SmartPhone  {
    private String OS;
    private int storage; // in gigabytes
    private String cameraResolution;

    // Constructor
    public SmartPhone(String OS, int storage, String cameraResolution) {
        super();
        this.OS = OS;
        this.storage = storage;
        this.cameraResolution = cameraResolution;
    }

    // Getters and Setters
    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public String getCameraResolution() {
        return cameraResolution;
    }

    public void setCameraResolution(String cameraResolution) {
        this.cameraResolution = cameraResolution;
    }

    @Override
    public String toString() {
        return "Smartphone [OS=" + OS + ", storage=" + storage + "GB, cameraResolution=" + cameraResolution + "]";
    }
}
