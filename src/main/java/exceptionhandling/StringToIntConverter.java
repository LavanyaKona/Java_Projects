package exceptionhandling;

public class StringToIntConverter {

    public int convertStringToInt(String str) throws NumberFormatException {
        return Integer.parseInt(str);
    }
}
