package service.impl;

import dominio.enums.ContactsType;
import mapping.dtos.ContactDto;
import repository.ContactRepository;
import repository.impl.ContactRepositoryImpl;
import service.ContactService;

import java.util.List;

public final class ContactServiceImpl implements ContactService {
    List<ContactDto> contacts;

    public ContactServiceImpl() {
        ContactRepository repoContact = new ContactRepositoryImpl();
        contacts = repoContact.getAllContact();
    }

    @Override
    public List<ContactDto> getAllContacts() {
        return contacts;
    }

    @Override
    public List<ContactDto> filterContacts(ContactsType type) {
        return contacts;
    }
    @Override
    public long countContactsPerCategory() {
        return contacts.stream()
                .filter(c->c.type().equals(ContactsType.FAMILY))
                .count();
    }
    @Override
    public List<ContactDto> contactsPhoneName() {
        return contacts.stream()
                .filter(c->c.type().equals(ContactsType.WORK))
                .filter(c-> Boolean.parseBoolean(c.name()))
                .filter(c-> Boolean.parseBoolean(c.phone()))
                .toList();
    }

    @Override
    public void save() {

    }
}
