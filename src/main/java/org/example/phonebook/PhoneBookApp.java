package org.example.phonebook;

public class PhoneBookApp {
    public static void main(String[] args) {
        PhoneBook contacts = new PhoneBook();
        contacts.add("Аликин", "123-45-67");
        contacts.add("Аликин", "765-43-21");
        contacts.add("Онегина", "222-22-22");

        System.out.println(contacts.get("Аликин"));
        System.out.println(contacts.get("Онегина"));
        System.out.println(contacts.get("Иванов"));
    }
}
