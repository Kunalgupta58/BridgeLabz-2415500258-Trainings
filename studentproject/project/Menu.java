package studentproject.project;

import java.util.Scanner;

public class Menu implements IMenu {
    @Override
    public void showMenu() {
        IStudent studentOps = new StudentImpl();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("\nWelcome to JDBC");
            System.out.println("Student Database Menu");
            System.out.println("1. Insert a student");
            System.out.println("2. Insert Multiple Students");
            System.out.println("3. Update a student");
            System.out.println("4. Update multiple Students");
            System.out.println("5. Delete a student");
            System.out.println("6. Delete multiple Students");
            System.out.println("7. Show Students");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            
            if (sc.hasNextInt()) {
                choice = sc.nextInt();
            } else {
                System.out.println("Please enter a valid number!");
                sc.next();
                continue;  
            }

            switch (choice) {
                case 1:
                    studentOps.insertStudent();
                    break;
                case 2:
                    studentOps.insertMultipleStudents();
                    break;
                case 3:
                    studentOps.updateStudent();
                    break;
                case 4:
                    studentOps.updateMultipleStudents();
                    break;
                case 5:
                    studentOps.deleteStudent();
                    break;
                case 6:
                    studentOps.deleteMultipleStudents();
                    break;
                case 7:
                    studentOps.showStudents();
                    break;
                case 8:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println(" Invalid choice!");
                    break;
            }
        } while (choice != 8);

        
    }
}
