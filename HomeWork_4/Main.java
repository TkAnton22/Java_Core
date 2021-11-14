package HomeWork_4;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        String[] arr = {"I", "love", "Java", "qwerty", "ytrewq", "I", "I", "love", "love", "Java", "Java", "qwerty", "ytrewq", "lorem", "ipsum", "lorem ipsum", "1", "55", "I", "love", "Java", "I", "love", "Java"};
        LinkedHashSet<String> hashSet = new LinkedHashSet<>(Arrays.asList(arr));
        LinkedHashMap<String, Integer> arrCount = new LinkedHashMap<>();
        System.out.println("Список уникальных элементов: " + hashSet);
        System.out.println("Всего уникальных элементов: " + hashSet.size());
        for (String i: arr) {
            if (arrCount.containsKey(i)) {
                arrCount.put(i, arrCount.get(i) + 1);
            } else {
                arrCount.put(i, 1);
            }
        }
        System.out.println("Количество повторений элементов: \n" + arrCount);


        Phonebook phonebook = new Phonebook();
        phonebook.add("Иванов", "880005553535");
        phonebook.add("Сидоров", "89112223344");
        phonebook.add("Сидоров", "891113334455");
        phonebook.add("Морковкин", "89114445566");
        phonebook.add("Картошкин", "89115556677");
        phonebook.add("Капустин", "89116667788");
        phonebook.add("Иванов", "89117778899");
        phonebook.add("Сидоров", "89118889900");
        phonebook.get("Морковкин");
        phonebook.get("Картошкин");
        phonebook.get("Иванов");
        phonebook.get("Сидоров");
        phonebook.get("404");
       // System.out.println(phonebook);
    }
}




