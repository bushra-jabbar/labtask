public class Employee {
         private  String employeeID;
          private  String name;
          private static   String designation;

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getDesignation() {
        return designation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee(String employeeID,String name,String designation) {
        this.employeeID = employeeID;
        this.name=name;
        this.designation="Lab Attendant";
    }

}
