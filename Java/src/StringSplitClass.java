import java.util.Arrays;

public class StringSplitClass {
    public static String[] solution(String s) {
        if (s.length() < 1) {
            return new String[0];
        }
        int len;
        if (s.length() % 2 == 1) {
            len = s.length() / 2 + 1;
        }
        else {
            len = s.length() / 2;
        }
        String[] result = new String[len];
        char[] characters = s.toCharArray();
        Arrays.fill(result, "");
        int j = 0;
        for (char c : characters) {
            if (result[j].length() > 1) {
                j++;
            }
            result[j] += c;
        }
        if (result[j].length() < 2)
            result[j] += '_';
        return result;
    }
}
