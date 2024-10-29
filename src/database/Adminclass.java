package database;

/**
 *
 * @author X1
 */
public class Adminclass {
     private String name;
    private int age;
    private String ssn; // Social Security Number
    private String email;
    private String phoneNumber;
    private String gender;
    private String dateOfBirth;

    // Constructor
    public Adminclass(String name, int age, String ssn, String email, String phoneNumber, String gender, String dateOfBirth) {
        this.name = name;
        this.age = age;
        this.ssn = ssn;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
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

    // Getter and Setter for SSN
    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    // Getter and Setter for Email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Getter and Setter for Phone Number
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Getter and Setter for Gender
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    // Getter and Setter for Date of Birth
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    // Override toString method for better readability
    @Override
    public String toString() {
        return "Admin{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ssn='" + ssn + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", gender='" + gender + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }
}
