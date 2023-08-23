package mapping.mappers;

import dominio.models.Contact;
import mapping.dtos.ContactDto;

import java.util.List;

public class ContactMapper {
    public static ContactDto mapFrom(Contact source){
        return new ContactDto(source.getId(),
                source.getName(),
                source.getType(),
                source.getAddress(),
                source.getEmail(),
                source.getPhone());
    }

    public static Contact mapFrom(ContactDto source){
        return new Contact(source.id(),
                source.name(),
                source.type(),
                source.address(),
                source.email(),
                source.phone());
    }

    public static List<Contact> mapFrom(List<ContactDto> source){
        return source.parallelStream()
                .map(ContactMapper::mapFrom)
                .toList();

    }
    public static List<ContactDto> mapFromDto(List<Contact> source){
        return source.parallelStream()
                .map(ContactMapper::mapFrom)
                .toList();

    }
}
