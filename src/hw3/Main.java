package hw3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        // 1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и вывести список
        // уникальных слов, из которых состоит массив (дубликаты не считаем). Посчитать сколько раз встречается каждое слово.

        String[] array = new String[]{"aa", "bb", "cc", "dd", "ee", "aa", "cc", "aa", "zz", "aa", "bb", "yy", "a", "abc"};

        Map<String, Integer> map = new HashMap<>();
        for (String s : array) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        System.out.println(map.keySet());
        System.out.println(map);

        // 2. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров. В
        // этот телефонный справочник с помощью метода add() можно добавлять записи. С помощью метода get() искать номер
        // телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов (в случае
        // однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.

        PhoneBook book = new PhoneBook();
        book.add("Ivanov", "9012345678");
        book.add("Petrov", "9021111234");
        book.add("Sidorov", "9991230000");
        book.add("Petrov", "9501231111");

        System.out.println(book.get("Petrov"));

    }
}
