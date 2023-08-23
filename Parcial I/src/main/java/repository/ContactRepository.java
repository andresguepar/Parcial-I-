package repository;

import mapping.dtos.ContactDto;

import java.util.List;

public interface ContactRepository {
    List<ContactDto> getAllContact();
}
