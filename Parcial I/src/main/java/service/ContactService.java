package service;

import dominio.enums.ContactsType;
import mapping.dtos.ContactDto;

import java.util.List;

public interface ContactService {
    List<ContactDto> getAllContacts();
    List<ContactDto> filterContacts(ContactsType type);
    long countContactsPerCategory();
    List<ContactDto> contactsPhoneName();
    void save();
}
