package database;

/**
 *
 * @author X1
 */
public class Memberclass {
     private String name;
    private int age;
    private String gender;
    private String email;
    private String phoneNum;
    private int memberNum;

    // Constructor
    public Memberclass(String name, int age, String gender, String email, String phoneNum, int memberNum) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.phoneNum = phoneNum;
        this.memberNum = memberNum;
    }

    // Getter and Setter for Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for Age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getter and Setter for Gender
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    // Getter and Setter for Email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Getter and Setter for Phone Number
    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    // Getter and Setter for Member Number
    public int getMemberNum() {
        return memberNum;
    }

    public void setMemberNum(int memberNum) {
        this.memberNum = memberNum;
    }

    // Override toString method for better readability
    @Override
    public String toString() {
        return "Members{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", memberNum=" + memberNum +
                '}';
    }
}
