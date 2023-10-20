package week05LabAssign01;

public class Computer {private  String computerNumber;
    private String icdModel;
    private int ramSize;
    private int hddSize;
    private boolean hasGPU;
    public String getComputerNumber() {
        return computerNumber;
    }

    // Setter method for computerNumber
    public void setComputerNumber(String computerNumber) {
        this.computerNumber = computerNumber;
    }

    // Getter method for icdModel
    public String getIcdModel() {
        return icdModel;
    }

    // Setter method for icdModel
    public void setIcdModel(String icdModel) {
        this.icdModel = icdModel;
    }

    // Getter method for ramSize
    public int getRamSize() {
        return ramSize;
    }

    // Setter method for ramSize
    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    // Getter method for hddSize
    public int getHddSize() {
        return hddSize;
    }

    // Setter method for hddSize
    public void setHddSize(int hddSize) {
        this.hddSize = hddSize;
    }

    // Getter method for hasGPU
    public boolean isHasGPU() {
        return hasGPU;
    }

    // Setter method for hasGPU
    public void setHasGPU(boolean hasGPU) {
        this.hasGPU = hasGPU;
    }
    public Computer(String computerNumber, String icdModel, int ramSize, int hddSize, boolean hasGPU) {
        this.computerNumber = computerNumber;
        this.icdModel = icdModel;
        this.ramSize = ramSize;
        this.hddSize = hddSize;
        this.hasGPU = hasGPU;
    }
    // Clone method
    public Computer clone() {
        return new Computer(this.computerNumber, this.icdModel, this.ramSize, this.hddSize, this.hasGPU);
    }

    // Equals method
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Computer other = (Computer) obj;
        return this.computerNumber.equals(other.computerNumber) &&
                this.icdModel.equals(other.icdModel) &&
                this.ramSize == other.ramSize &&
                this.hddSize == other.hddSize &&
                this.hasGPU == other.hasGPU;
    }
}
