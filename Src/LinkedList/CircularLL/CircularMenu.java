package LinkedList.CircularLL;

import java.util.Scanner;

public class CircularMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circular list = new Circular();
        int choice, data;

        do {
            System.out.println("\n===== LINKED LIST MENU =====");
            System.out.println("1. Insert Left");
            System.out.println("2. Insert Right");
            System.out.println("3. Delete Left");
            System.out.println("4. Delete Right");
            System.out.println("5. Print List");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data to insert left: ");
                    data = sc.nextInt();
                    list.insert_left(data);
                    break;

                case 2:
                    System.out.print("Enter data to insert right: ");
                    data = sc.nextInt();
                    list.insert_right(data);
                    break;

                case 3:
                    list.delete_left();
                    break;

                case 4:
                    list.delete_right();
                    break;

                case 5:
                    list.print_list();
                    break;


                case 0:
                    System.out.println("Exiting… stay synced! 👋");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 0);

        sc.close();
    }
}
