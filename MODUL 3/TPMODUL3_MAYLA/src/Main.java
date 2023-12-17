import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Student Name : ");
        String name = scanner.nextLine();
        int id = 0;
        do {
            try {
                System.out.println("Enter Student ID : ");
                id = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer for Student ID.");
                scanner.nextLine();
            }
        } while (true);
        scanner.nextLine();
        System.out.println("Enter courses to enroll in (separated by commas) : ");
        String course = scanner.nextLine();

        String[][] data = {
                { "101", "Pemrograman Berbasis Objek", "Haris", "Metta" },
                { "102", "Desain Jaringan Komputer", "Windy", "Amilia" }
        };

        for (String[] y : data) {
            String IDCourse = y[0];
            String nameCourse = y[1];
            String studentCourse = y[2];
            String studentCourse2 = y[3];

            System.out.println("\nCourse ID : " + IDCourse + "\nCourse Name : " + nameCourse + "\n - Student : "
                    + studentCourse + "\n - Student : " + studentCourse2);
        }

        Student murid = new Student(name, id);
        murid.enrollInCourse(course);
        System.out.println(murid.getUserDetails());

        Teacher teacher = new Teacher("\nPak Yoga", 0);
        teacher.teachClass("Math");

        Admin admin = new Admin("Hudza", 0);
        admin.manageSystem("Telkom University");

        scanner.close();
    }
}