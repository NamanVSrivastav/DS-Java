package LinkedList.EMS;
import java.lang.System;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Struct list = new Struct();
        int choice;

        do {
            System.out.println("\n===== LINKED LIST MENU =====");
            System.out.println("1.Register an Employee");
            System.out.println("2. Search an Employee");
            System.out.println("3. Print list ");
            System.out.println("4. Delete an Employee");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter details to register employee  ");
                    System.out.println("Enter Employee Name:  ");
                    String name = sc.next();
                    System.out.println("Enter Employee id   ");
                    int id =sc.nextInt();
                    System.out.println("Enter salary of an employee  ");
                    float sal=sc.nextFloat();
                    System.out.println("Enter gender og an employee  ");
                    char gender=sc.next().charAt(0);
                    list.insert(name,id,sal,gender);
                    break;
                case 2:
                    System.out.print("Enter id to search: ");
                    id = sc.nextInt();
                    System.out.println(list.search_list(id) ?
                            "Found ✔" : "Not Found X");
                    break;

                case 3:
                    list.print_list();
                    break;
                case 4:
                    System.out.print("\nEnter Employee ID to delete: ");
                    id = sc.nextInt();
                    list.delete(id);
                    break;
                case 0:
                    System.out.println("Exiting… stay synced! ");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 0);

        sc.close();
    }
}
