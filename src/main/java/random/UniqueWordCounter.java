package random;

import java.util.HashMap;
import java.util.Map;

public class UniqueWordCounter {

    public Map<String, Integer> countUniqueWords(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Input string cannot be null");
        }

        Map<String, Integer> wordCountMap = new HashMap<>();
        String[] words = str.split("\\s+");

        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        Map<String, Integer> uniqueWordCountMap = new HashMap<>();
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                uniqueWordCountMap.put(entry.getKey(), entry.getValue());
            }
        }

        return uniqueWordCountMap;
    }
}

