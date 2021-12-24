package GeekBrains;

import java.util.ArrayList;
import java.util.*;


public class Main {

    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add(286458963l,"Oleg");
        phoneBook.add(299723276l, "Egor");
        phoneBook.add(645915537l, "Masha");
        phoneBook.add(657156265l, "Nastya");
        phoneBook.add(798645132l, "Carl");
        phoneBook.add(714825936l, "Andrew");
        phoneBook.add(625825048l, "Andrew");

        phoneBook.get("Andrew");

	List<String> list = new ArrayList<>();
    list.addAll(Arrays.asList("Кот", "Собака", "Осел", "Автомобиль", "Зоопарк","Собака","Осел",
            "Кот", "Собака", "Осел", "Автомобиль","Собака", "Осел", "Автомобиль", "Зоопарк","Зоопарк","Собака",
            "Осел","Лев"));

        ((ArrayList)list).trimToSize();

       Set<String> unique = new HashSet<>(list);

        System.out.println(list.toString());

        System.out.println(unique.toString());

        for (String k: unique) {
            System.out.println(k + ": " + Collections.frequency(list, k));
        }

    }
}
