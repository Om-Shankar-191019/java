import java.io.InputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int choice;
        ContactManager cm = new ContactManager();
        do{
            System.out.println("...Enter a valid option and hit enter...");
            System.out.println("Enter 1 to view all contacts");
            System.out.println("Enter 2 to add new contact");
            System.out.println("Enter 3 to delete a contact");
            System.out.println("Enter 4 to search a  contact");
            System.out.println("Enter 5 to Exit program.");


            choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:{
                    cm.showAllContacts();
                    break;
                }

                case 2:{
                    System.out.println("Enter name: ");
                    String name = sc.nextLine();
                    System.out.println("Enter phoneNo: ");
                    String phoneNo = sc.nextLine();
                    System.out.println("Enter email: ");
                    String email = sc.nextLine();
                    cm.addContact(name,phoneNo,email);
                    break;
                }


            case 3:{
                System.out.println("Enter name: ");
                String name = sc.nextLine();
                cm.removeContactByName(name);
                break;

            }
            case 4:{
                System.out.println("Enter name: ");
                String name = sc.nextLine();
                cm.searchContactByName(name);
                break;

            }
                case 5:{
                    System.out.println("Thankyou for chosing our app.");
                    break;
                }
                default:
                    System.out.println("Invalid input");


            }



        }while(choice != 5);

        sc.close();



    }
}