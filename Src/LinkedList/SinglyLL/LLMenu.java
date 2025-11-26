package LinkedList.SinglyLL;


import java.util.Scanner;

public class LLMenu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedListClass list = new LinkedListClass();
        int choice, data;

        do {
            System.out.println("\n===== LINKED LIST MENU =====");
            System.out.println("1. Insert Left");
            System.out.println("2. Insert Right");
            System.out.println("3. Delete Left");
            System.out.println("4. Delete Right");
            System.out.println("5. Search");
            System.out.println("6. Print List");
            System.out.println("7. Insert After ");
            System.out.println("8. Delete Element");
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
                    System.out.print("Enter key to search: ");
                    data = sc.nextInt();
                    System.out.println(list.search_list(data) ?
                            "Found ✔️" : "Not Found ❌");
                    break;

                case 6:
                    list.print_list();
                    break;

                case 7:
                    System.out.print("Enter reference to search: ");
                    int ref = sc.nextInt();
                    System.out.print("Enter new element: ");
                    int e = sc.nextInt();
                    list.insert_after(ref,e);
                    break;
                case 8:
                    System.out.print("Enter key to delete:");
                    data = sc.nextInt();
                    list.delete_element(data);
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
