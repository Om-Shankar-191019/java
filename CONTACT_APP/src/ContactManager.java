import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ContactManager
{
    private List<Contact> contactBook = new ArrayList<>();

    public void addContact(String name, String phoneNo, String email){
        contactBook.add(new Contact(name,phoneNo,email));
    }

    public void showAllContacts(){
        if(contactBook.isEmpty()){
            System.out.println("Contact Book is Empty!");
        }
        for(Contact c : contactBook){
            String contString = c.getFullDetail();
            System.out.println("---------------------");
            System.out.println(contString);
        }
    }

    public void removeContactByName(String name){
        Iterator<Contact> iterator = contactBook.iterator();
        boolean removed = false;

        while(iterator.hasNext()){
            Contact c = iterator.next();
            if(c.getName().equalsIgnoreCase(name)){
                iterator.remove();
                removed = true;
                System.out.println(name + " removed from contact Book.");
                break;
            }
        }

        if(!removed){
            System.out.println("Contact not found!");
        }
    }

    public void searchContactByName(String name){
        Iterator<Contact> it = contactBook.iterator();
        boolean found = false;
        while(it.hasNext()){
            Contact c = it.next();
            if(c.getName().equalsIgnoreCase(name)){
                found = true;
                String foundData = c.getFullDetail();
                System.out.println(foundData);
                break;
            }
        }

        if(!found){
            System.out.println("Contact not found..");
        }
    }
}
