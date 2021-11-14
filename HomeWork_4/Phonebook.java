package HomeWork_4;

import java.util.ArrayList;
import java.util.HashMap;

public class Phonebook {

    HashMap<String, ArrayList<String>> phonebook = new HashMap<>();

    public void add(String userName, String phoneNumber) {
        if (phonebook.get(userName) == null) {
            ArrayList<String> phoneList = new ArrayList<>();
            phoneList.add(phoneNumber);
            phonebook.put(userName, phoneList);
        } else {
            phonebook.get(userName).add(phoneNumber);
        }
    }

    public void get(String userName) {
        if (phonebook.containsKey(userName)) {
            System.out.println("Абонент: " + userName + " " + phonebook.get(userName));
        } else {
            System.out.println("Абонента нет в списке");
        }
    }
}


