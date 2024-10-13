package service;

import model.Contact;
import org.springframework.stereotype.Service;
import repository.ContactRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ContactService {

    private final ContactRepository contactRepository;

    public ContactService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }

    public Optional<Contact> getContactById(Integer id) {
        return contactRepository.findById(id);
    }

    public Contact saveOrUpdateContact(Contact contact) {
        return contactRepository.save(contact);
    }

    public void deleteContactById(Integer id) {
        contactRepository.deleteById(id);
    }
}
