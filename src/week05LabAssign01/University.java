package week05LabAssign01;

public class University {    private final Lab[] labs;

    public University(int numberOfLabs) {
        labs = new Lab[numberOfLabs];
    }

    public void addLab(Lab lab) {
        for (int i=0;i<labs.length; i++) {
            if (labs[i]==null) {
                labs[i]=lab;
                break; }}}

}
