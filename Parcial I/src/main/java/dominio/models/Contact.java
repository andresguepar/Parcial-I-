package dominio.models;

import dominio.enums.ContactsType;

public class Contact {
    private long id;
    private String name;
    private ContactsType type;
    private String address;
    private String email;
    private String phone;

    public Contact(long id, String name, ContactsType type, String address, String email, String phone) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.address = address;
        this.email = email;
        this.phone = phone;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ContactsType getType() {
        return type;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }
}
