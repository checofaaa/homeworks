package org.example.phonebook;

import java.util.*;

public class PhoneBook {
    private Map<String, List<String>> contacts = new HashMap<>();

    public void add(String surname, String phone) {
        if (!contacts.containsKey(surname)) {
            List<String> phones = new ArrayList<>();
            phones.add(phone);
            contacts.put(surname, phones);
        } else {
            contacts.get(surname).add(phone);
        }
    }

    public List<String> get(String surname) {
        if (!contacts.containsKey(surname)) {
            System.out.println("Контакта с фамилией '" + surname + "' не существует.");
            return Collections.emptyList();
        }

        return contacts.get(surname);
    }
}
