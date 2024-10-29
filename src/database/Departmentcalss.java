package database;

/**
 *
 * @author X1
 */
public class Departmentcalss {
    private int departmentNum;
    private String name;

    // Constructor
    public Departmentcalss(int departmentNum, String name) {
        this.departmentNum = departmentNum;
        this.name = name;
    }

    // Getter and Setter for Department Number
    public int getDepartmentNum() {
        return departmentNum;
    }

    public void setDepartmentNum(int departmentNum) {
        this.departmentNum = departmentNum;
    }

    // Getter and Setter for Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Override toString method for better readability
    @Override
    public String toString() {
        return "Department{" +
                "departmentNum=" + departmentNum +
                ", name='" + name + '\'' +
                '}';
    }
}
