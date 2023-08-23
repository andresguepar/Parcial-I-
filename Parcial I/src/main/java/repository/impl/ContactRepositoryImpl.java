package repository.impl;

import dominio.enums.ContactsType;
import dominio.models.Contact;
import mapping.dtos.ContactDto;
import mapping.mappers.ContactMapper;
import repository.ContactRepository;

import java.util.ArrayList;
import java.util.List;

public class ContactRepositoryImpl implements ContactRepository {
    private List<Contact> contacts;
    public ContactRepositoryImpl() {
        contacts = new ArrayList<>();

        contacts.add(new Contact(1, "Wu Bi", ContactsType.FAMILY,"A Street","wubi@gmail.com","2122"));
        contacts.add(new Contact(2, "Su Yu",ContactsType.FAMILY,"B Street","suyu@gmail.com","12344"));
        contacts.add(new Contact(3, "Cho", ContactsType.FRIENDS,"C Street","cho@gmail.com","71772"));
        contacts.add(new Contact(4, "Lexa", ContactsType.WORK,"D Street","lexa@gmail.com","176262"));
    }
    @Override
    public List<ContactDto> getAllContact() {
        return ContactMapper.mapFromDto(contacts);
    }

}
