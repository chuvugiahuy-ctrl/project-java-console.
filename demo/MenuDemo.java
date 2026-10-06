import java.util.Scanner;

public class MenuDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager studentManager = new StudentManager();
        while(true){            
            System.out.println("Student management");
            System.out.println("------------------------");
            System.out.println("1. Show student list.");
            System.out.println("2. Add new student.");
            System.out.println("3. Update student information.");
            System.out.println("4. Delete student by rollnumber.");
            System.out.println("5. Search student by keyword.");
            System.out.println("0. Exist program.");
            System.out.println("------------------------");
            System.out.println("Please enter your choice: ");
            int choice = scanner.nextInt(); // 1 enter
            scanner.nextLine();
            switch (choice) {
                case 1:
                    studentManager.displayListStudent();
                    break;
                case 2:
                    studentManager.createNewStudent();                    
                    break;
                case 3:
                    studentManager.updateStudentInformation();
                    break;
                case 4:
                    studentManager.deleteStudent();
                    break;
                case 5:
                    studentManager.searchStudent();
                    break;
                case 0:
                    System.out.println("See you later!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter number from 0 to 5.");
                    break;
            }
            if(choice == 0){
                break;
            }
            System.out.println("Enter to continue!");
            scanner.nextLine(); // lấy dấu enter
        }
        scanner.close();
    }
}