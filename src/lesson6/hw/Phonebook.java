package lesson6.hw;

public class Phonebook {
    private Contact[] contacts;

    public Phonebook(Contact[] contacts) {
        this.contacts = contacts;
    }


    public Contact getByName(String name) {
        for (int i=0;i<contacts.length;i++) {
            if (contacts[i].getName().equals(name)) {
                return contacts[i];
            }
        }
        return null;
    }

    public Contact getBySurname(String surname) {
        for (int i=0;i<contacts.length;i++) {
            if (contacts[i].getSurname().equals(surname)) {
                return contacts[i];
            }
        }
        return null;
    }

    public Contact getByPhoneNumber(String phoneNumber) {
        for (int i=0;i<contacts.length;i++) {
            if (contacts[i].getPhone().equals(phoneNumber)) {
                return contacts[i];
            }
        }
        return null;
    }


}
