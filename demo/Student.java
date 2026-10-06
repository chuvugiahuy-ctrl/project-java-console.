public class Student {

    private String rollNumber;
    private String fullName;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String dob;   

    public Student() {
        
    }

    public Student(String rollNumber, String fullName) {
        this.rollNumber = rollNumber;
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Thông tin sinh viên gồm: rollnumber là " + rollNumber + ", fullName là " + fullName + ", email là " + email + ", phone là " + phone
                + ", birthday là " + dob + "";
    }    

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRollNumber() {
        return rollNumber;
    }
    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }
    public String getFullName() {
        return firstName + " " + lastName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getDob() {
        return dob;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }
}