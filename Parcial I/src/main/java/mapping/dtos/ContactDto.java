package mapping.dtos;

import dominio.enums.ContactsType;

public record ContactDto(long id,
                         String name,
                         ContactsType type,
                         String address,
                         String email,
                         String phone) {
}
