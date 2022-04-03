public class XOClass {
    public static boolean getXO (String str) {
        int x = 0;
        int o = 0;
        for (char c : str.toCharArray()) {
            if (c == 'x') x++;
            if (c == 'o') o++;
        }
        return x == o;
    }
}
