package lesson6.hw;

public class Test {
    public static void main(String[] args) {
        Contact[] contacts = new Contact[10];
        contacts[0] = new Contact("Onisim", "Albarov", "89277099770");
        contacts[1] = new Contact("Sergey", "Albarov", "89277700997");
        contacts[2] = new Contact("Anna", "Albarova", "89277122331");
        contacts[3] = new Contact("Sergey", "Vakhitov", "89277700331");
        contacts[4] = new Contact("Sergey", "Voronkov", "89277700333");
        contacts[5] = new Contact("Roman", "Sidorov", "89277700442");
        contacts[6] = new Contact("Rustam", "Sadykov", "89277700330");

        Phonebook phonebook = new Phonebook(contacts);

        System.out.println(phonebook.getByName("Sergey"));
        System.out.println(phonebook.getBySurname("Vakhitov"));
        System.out.println(phonebook.getByPhoneNumber("89277700442"));



    }
}
