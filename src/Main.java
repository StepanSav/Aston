import java.util.HashMap;
import java.util.Map;

public class Main {
    public static class UniqueWords {
        public static void main(String[] args) {
            String[] words = {
                    "стол", "стул", "вилка", "ложка", "мышка",
                    "подушка", "кровать", "лампа", "вода", "плойка",
                    "стол", "стул", "кресло", "апельсин", "цифра"
            };
            Map<String, Integer> wordCount = new HashMap<>();

            for (String word : words) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
            System.out.println("Уникальные слова и их количество:");
            for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

            PhoneBook phoneBook = new PhoneBook();

            // Добавляем записи в телефонный справочник
            phoneBook.add("Иванов", "123-456");
            phoneBook.add("Петров", "987-654");
            phoneBook.add("Иванов", "321-654");
            phoneBook.add("Сидоров", "456-789");
            phoneBook.add("Петров", "654-321");

            // Получаем номера по фамилии
            System.out.println("Номера телефонов для Иванова: " + phoneBook.get("Иванов"));
            System.out.println("Номера телефонов для Петрова: " + phoneBook.get("Петров"));

            // Вывод всех записей (для проверки)
            System.out.println("\nВсе записи в телефонном справочнике:");
            phoneBook.printAll();
        }
    }
}