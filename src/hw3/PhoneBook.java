package hw3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    Map<String, String> book = new HashMap<>();

    public void add(String name, String phone) {
        this.book.put(phone, name);
    }

    public List<String> get(String name) {
        List<String> founded = new ArrayList<>();
        this.book.forEach((k, v) -> {
            if (v.equals(name)) founded.add(k);
        });
        return founded;
    }
}
