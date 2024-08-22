import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UniqueWordsCounter {
    public static void main(String[] args) {
        String[] words = {
                "apple", "banana", "orange", "apple", "pear",
                "banana", "kiwi", "banana", "apple", "grape",
                "pear", "banana", "kiwi", "melon", "orange",
                "apple", "melon", "kiwi", "grape", "banana"
        };
        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }
        List<String> uniqueWords = new ArrayList<>(wordCountMap.keySet());
        System.out.println("Уникальные слова и их количество:");
        for (String word : uniqueWords) {
            System.out.println(word + ": " + wordCountMap.get(word));
        }
    }
}