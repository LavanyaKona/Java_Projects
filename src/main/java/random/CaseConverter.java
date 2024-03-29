package random;

public class CaseConverter {

    public static String convertCase(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Input string cannot be null");
        }

        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                result.append(Character.toUpperCase(c));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}

