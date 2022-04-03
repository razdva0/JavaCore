import java.util.*;

public class LineNumberingClass {
    public static List<String> number(List<String> lines) {
        List<String> result = new ArrayList<>();
        byte i = 0;
        for (String x : lines) {
            result.add(String.valueOf(++i) + ": " + x);
        }
        return result;
    }
}
