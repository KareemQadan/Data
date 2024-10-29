package database;

/**
 *
 * @author X1
 */
public class Communitiesclass {
       private String name;
    private int communityNum;

    // Constructor
    public Communitiesclass(String name, int communityNum) {
        this.name = name;
        this.communityNum = communityNum;
    }

    // Getter and Setter for Community Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for Community Number
    public int getCommunityNum() {
        return communityNum;
    }

    public void setCommunityNum(int communityNum) {
        this.communityNum = communityNum;
    }

    // Override toString method for better readability
    @Override
    public String toString() {
        return "Communities{" +
                "name='" + name + '\'' +
                ", communityNum=" + communityNum +
                '}';
    }
}
