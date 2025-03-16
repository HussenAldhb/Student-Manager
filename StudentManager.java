import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    double grade;

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }
}

public class StudentManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.println("Welcome to the Student Manager!");

        while (true) {
            System.out.println("\nEnter student name (or 'exit' to finish): ");
            String name = scanner.nextLine();

            if (name.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.println("Enter student grade (0-100): ");
            double grade = scanner.nextDouble();
            scanner.nextLine(); // تنظيف السطر

            students.add(new Student(name, grade));
        }

        if (students.isEmpty()) {
            System.out.println("No students added.");
        } else {
            System.out.println("\n--- Student List ---");
            double total = 0;
            for (Student s : students) {
                System.out.println("Name: " + s.name + ", Grade: " + s.grade);
                total += s.grade;
            }
            double average = total / students.size();
            System.out.println("Average Grade: " + average);
        }

        System.out.println("Thank you for using Student Manager!");
        scanner.close();
    }
}
