package dataloader;

import model.Contact;
import model.Name;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import service.ContactService;

@Component
public class DataLoader implements CommandLineRunner {

    private final ContactService contactService;

    public DataLoader(ContactService contactService) {
        this.contactService = contactService;
    }

    @Override
    public void run(String... args) throws Exception {


        Name name1 = new Name("Mr.", "John", "A.", "Doe");
        Contact contact1 = new Contact(name1, "CEO", "TechCorp");

        Name name2 = new Name("Ms.", "Jane", "B.", "Smith");
        Contact contact2 = new Contact(name2, "Marketing Manager", "MediaHouse");

        Name name3 = new Name("Dr.", "Emily", "C.", "Brown");
        Contact contact3 = new Contact(name3, "Public Relations", "HealthCo");


        contactService.saveOrUpdateContact(contact1);
        contactService.saveOrUpdateContact(contact2);
        contactService.saveOrUpdateContact(contact3);
    }
}
