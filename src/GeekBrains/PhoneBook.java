package GeekBrains;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
    private Map<Long, String> phoneBook;

    public PhoneBook() {
        this.phoneBook = new HashMap<>();
    }

    public void add(long number, String surname) {
        phoneBook.put(number, surname);
    }

    public void get(String surname) {
        if (phoneBook.containsValue(surname)) {
            Set<Map.Entry<Long, String>> set = phoneBook.entrySet();
            for (Map.Entry<Long, String> temp : set) {
                if (temp.getValue().equals(surname)) {
                    System.out.println(temp.getValue() + " : " + temp.getKey());
                }
            }
        }
        else {
            System.out.println("Введен неверный номер!");
        }

    }
}
