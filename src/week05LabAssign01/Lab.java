package week05LabAssign01;

import java.util.Arrays;

public class Lab { private  String labID;
    private Employee labAttendant;
    private LabStatus status;
    private Computer[] computers;

    public Lab(String labID) {
        this.labID = labID;
    }

    public Lab(Employee labAttendant) {
        this.labAttendant = labAttendant;
    }

    public Lab(LabStatus status) {
        this.status = status;
    }

    public Lab(Computer[] computers) {
        this.computers = computers;
    }

    public Employee getLabAttendant() {
        return labAttendant;
    }

    public void setLabAttendant(Employee labAttendant) {
        this.labAttendant = labAttendant;
    }

    public void addComputer(Computer computer) {
        for (int i=0;i<computers.length; i++) {
            if (computers[i]==null) {
                computers[i] =computer;
                break;}}
    }

    public boolean removeComputer(String computerNumber) {
        for (int i = 0; i < computers.length; i++) {
            if (computers[i]!=null &&
                    computers[i].getComputerNumber().equals(computerNumber)) {
                computers[i]=null;
                return true;}}
        return false;
    }

    public Computer getComputer(String computerNumber) {
        for (Computer computer:computers) {
            if (computer!=null && computer.getComputerNumber().equals(computerNumber)) {
                return computer;
            }
        }
        return null;
    }
    @Override
    public String toString() {
        return "Lab{" +
                "labID='" + labID + '\'' + ", status=" + status + ", labAttendant=" + labAttendant + ", computers=" + Arrays.toString(computers) + '}';
    }
}
