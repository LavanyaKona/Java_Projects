package random;

import java.util.HashMap;
import java.util.Map;

public class RepeatedCharacterIdentifier {

        public Map<Character, Integer> findRepeatedCharacters(String str) {
            if (str == null) {
                throw new IllegalArgumentException("Input string cannot be null");
            }

            Map<Character, Integer> charFrequencyMap = new HashMap<>();
            Map<Character, Integer> repeatedChars = new HashMap<>();

            // Count the frequency of each character in the string
            for (char c : str.toCharArray()) {
                charFrequencyMap.put(c, charFrequencyMap.getOrDefault(c, 0) + 1);
            }

            // Identify repeated characters
            for (Map.Entry<Character, Integer> entry : charFrequencyMap.entrySet()) {
                if (entry.getValue() > 1) {
                    repeatedChars.put(entry.getKey(), entry.getValue());
                }
            }

            return repeatedChars;
        }
    }


