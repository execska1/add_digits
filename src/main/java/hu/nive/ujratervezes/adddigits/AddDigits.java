package hu.nive.ujratervezes.adddigits;

public class AddDigits {
    public int addDigits(String input) {
        int result = 0;
        if (input == null || input.length() == 0) {
            result = -1;
        } else {
            for (char c : input.toCharArray()) {
                if (c > '0' && c <= '9') {
                    result += c - '0';
                }
            }
        }
        return result;
    }
}
