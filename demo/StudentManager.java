import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {

    ArrayList<Student> listStudent = new ArrayList<>();

    public void displayListStudent(){
        System.out.println("Display student list");
    }

    public void createNewStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Create new student");
        System.out.println("Add student information!");
        System.out.println("Please enter rollnumber:");
        String rollNumber = scanner.next();
        System.out.println("Please enter first name:");
        String firstName = scanner.next();
        System.out.println("Please enter last name:");
        String lastName = scanner.next();
        System.out.println("Please enter email:");
        String email = scanner.next();
        System.out.println("Please enter phone:");
        String phone = scanner.next();
        System.out.println("Please enter dob:");
        String dob = scanner.next();
        // tất cả trường còn lại
        Student student = new Student();
        student.setRollNumber(rollNumber);
        student.setFirstName(firstName);
        student.setLastName(lastName);
        student.setEmail(email);
        student.setPhone(phone);
        student.setDob(dob);
        System.out.println("Thông tin sinh viên vừa nhập: ");
        System.out.println(student);
        listStudent.add(student);        
    }

    public void updateStudentInformation(){
        System.out.println("Update student information");
    }

    public void deleteStudent(){
        System.out.println("Delete student");
    }

    public void searchStudent(){
        System.out.println("Search student");
    }
}