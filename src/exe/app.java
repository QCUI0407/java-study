package exe;

import java.util.ArrayList;
import java.util.Scanner;

public class app {
    public static ArrayList<info> All_contacts = new ArrayList<>();

    public static info loginInfo;

    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        run();
    }
//main function
    private static void run() {
                // Home page
                while (true) {

                    System.out.println("===================Home Page===================");
                    System.out.println("1. View contacts.");
                    System.out.println("2. Add a new contact.");
                    System.out.println("3. Search a contact by name.");
                    System.out.println("4. Delete an existing contact.");
                    System.out.println("5. Exit.");
                    System.out.println("Enter an option (1, 2, 3, 4 or 5):");
                    int command = sc.nextInt();
        
                    switch (command) {
                        case 1:
                            // show all
                            showAll();
                            break;
                        case 2:
                            add();
                            // add new contact
                            break;
                        case 3:
                            search();
                            // search
                            break;
                        case 4:
                            del();
                            // delete
                            break;
                        case 5:
                            // Exit
                            System.out.println("Bye!");
                            return;
                        default:
                            System.out.println("Command Error");
                    }
                }
        
    }

    // delete
    private static void del() {
    }

    // search
    private static void search() {
    }

    // add
    private static void add() {
        System.out.println("----------add-----------");


        while (true) {
        System.out.println("Enter name: ");
        String inputName = sc.nextLine();
        System.out.println("Enter Phone number: ");
        String inputNum = sc.nextLine();

        }

    }

    // show all
    private static void showAll() {
    }

}
