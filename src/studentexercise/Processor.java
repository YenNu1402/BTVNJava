package studentexercise;

import java.util.Date;
import java.util.Scanner;

public class Processor {
    public static void main(String[] args) {
        StudentList studentList = new StudentList();
        Scanner scanner = new Scanner(System.in);
        

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add a new student");
            System.out.println("2. Update a student by ID");
            System.out.println("3. Delete a student by ID");
            System.out.println("4. Display all students");
            System.out.println("5. Find the student with the highest GPA");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:
                    System.out.print("Enter ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Full Name: ");
                    String fullName = scanner.nextLine();
                    System.out.print("Enter Date of Birth (dd-MM-yyyy): ");
                    String dobString = scanner.nextLine();
                    Date dateOfBirth = DateUtil.parseDate(dobString);
                    System.out.print("Enter GPA: ");
                    float gpa = scanner.nextFloat();
                    scanner.nextLine();
                    System.out.print("Enter Major: ");
                    String major = scanner.nextLine();

                    Student newStudent = new Student(id, fullName, dateOfBirth, gpa, major);
                    studentList.addStudent(newStudent);
                    System.out.println("Student added successfully!");
                    break;
                case 2:
                    System.out.print("Enter ID of student to update: ");
                    String updateId = scanner.nextLine();
                    System.out.print("Enter new Full Name: ");
                    String newFullName = scanner.nextLine();
                    System.out.print("Enter new Date of Birth (dd-MM-yyyy): ");
                    String newDobString = scanner.nextLine();
                    Date newDateOfBirth = DateUtil.parseDate(newDobString);
                    
                    if (newDateOfBirth == null) {
                        System.out.println("Invalid date format. Please try again.");
                        break;
                    }
                    
                    System.out.print("Enter new GPA: ");
                    float newGpa = scanner.nextFloat();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter new Major: ");
                    String newMajor = scanner.nextLine();

                    Student updatedStudent = new Student(updateId, newFullName, newDateOfBirth, newGpa, newMajor);
                    boolean updated = studentList.updateStudentById(updateId, updatedStudent);
                    if (updated) {
                        System.out.println("Student updated successfully!");
                    } else {
                        System.out.println("Student with ID " + updateId + " not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter ID of student to delete: ");
                    String deleteId = scanner.nextLine();
                    boolean deleted = studentList.deleteStudentById(deleteId);
                    if (deleted) {
                        System.out.println("Student deleted successfully!");
                    } else {
                        System.out.println("Student with ID " + deleteId + " not found.");
                    }
                    break;

                case 4:
                    studentList.displayAllStudents();
                    break;

                case 5:
                    Student highestGpaStudent = studentList.findStudentWithHighestGpa();
                    if (highestGpaStudent != null) {
                        System.out.println("Student with the highest GPA:");
                        highestGpaStudent.displayInfo();
                    } else {
                        System.out.println("No students found.");
                    }
                    break;

                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}