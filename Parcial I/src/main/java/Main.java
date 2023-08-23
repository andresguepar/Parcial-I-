import dominio.enums.ContactsType;
import service.ContactService;
import service.impl.ContactServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContactService contactService = new ContactServiceImpl();

        String option;

        do {

            Scanner sc = new Scanner(System.in);

            System.out.print("""

                     ⟡ MENU ⟡
                     1. List all contacts and filter by category
                     2. Count contacts of Family category
                     3. Select Name and Phone
                     4. Save a contact
                    """);
            option = sc.next();

            switch (option) {
                case "1":
                    System.out.println(contactService.getAllContacts());
                    System.out.println("Type a category of contact in capitals: FAMILY-FRIENDS_WORK");
                    ContactsType typ = ContactsType.valueOf(sc.next());
                    System.out.println(contactService.filterContacts(typ));

                case "2":
                    System.out.println("In family category are "
                            + contactService.countContactsPerCategory()
                            + " contacts");
                case "3":
                    System.out.println(contactService.contactsPhoneName());
                case"4":

            }

        }  while (!option.equals("")) ;
    }
}
