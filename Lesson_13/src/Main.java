import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class PhoneBook {
    private Map<String, List<String>> phoneDirectory;
    public PhoneBook() {
        phoneDirectory = new HashMap<>();
    }
    public void add(String lastName, String phoneNumber) {
        phoneDirectory.computeIfAbsent(lastName, k -> new ArrayList<>()).add(phoneNumber);
    }
    public List<String> get(String lastName) {
        return phoneDirectory.getOrDefault(lastName, new ArrayList<>());
    }
    public void display() {
        for (Map.Entry<String, List<String>> entry : phoneDirectory.entrySet()) {
            System.out.println("Фамилия: " + entry.getKey() + ", Номера: " + entry.getValue());
        }
    }
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иванов", "123-456");
        phoneBook.add("Иванов", "654-321");
        phoneBook.add("Петров", "987-654");
        phoneBook.add("Сидоров", "111-222");
        phoneBook.add("Петров", "333-444");

        System.out.println("Номера Иванова: " + phoneBook.get("Иванов"));
        System.out.println("Номера Петрова: " + phoneBook.get("Петров"));
        System.out.println("Номера Сидорова: " + phoneBook.get("Сидоров"));
        System.out.println("Номера Смирнова: " + phoneBook.get("Смирнов"));
        System.out.println("\nТелефонный справочник:");
        phoneBook.display();
    }
}