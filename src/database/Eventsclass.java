package database;

/**
 *
 * @author X1
 */
public class Eventsclass {
     private int num;
    private String name;

    // Constructor
    public Eventsclass(int num, String name) {
        this.num = num;
        this.name = name;
    }

    // Getter and Setter for Event Number
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    // Getter and Setter for Event Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Override toString method for better readability
    @Override
    public String toString() {
        return "Events{" +
                "num=" + num +
                ", name='" + name + '\'' +
                '}';
    }
}
