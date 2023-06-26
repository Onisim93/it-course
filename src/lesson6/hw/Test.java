package lesson6.hw;

public class Test {
    public static void main(String[] args) {
        Contact[] contacts = new Contact[10];
        contacts[0] = new Contact("Onisim", "Albarov", "89277099770");
        contacts[1] = new Contact("Sergey", "Albarov", "89277700997");


    }

    public static void getContactByName(String name, Contact[] contacts) {
        for (int i=0;i<contacts.length; i++) {
            if (contacts[i].getName().equals(name)) {
                System.out.println(contacts[i].getName());
                System.out.println(contacts[i].getSurname());
                System.out.println(contacts[i].getPhone());
            }
        }
    }
}
