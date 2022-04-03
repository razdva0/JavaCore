public class StringUtilsClass {
    public static String toAlternativeString(String string) {
        StringBuilder result = new StringBuilder();
        for (char x : string.toCharArray())
        {
            if (x >= 'a' && x <= 'z') result.append((char)(x - 32));
            else if (x >= 'A' && x <= 'Z') result.append((char)(x + 32));
            else result.append(x);
        }
        return result.toString();
    }
    /*
    public static String toAlternativeString(String string) {
        String result = "";
        for (char c : string.toCharArray()) {
            if(Character.isUpperCase(c)) {
                result += Character.toLowerCase(c);
            } else {
                result += Character.toUpperCase(c);
            }
        }
        return result;
    }
    */
}
