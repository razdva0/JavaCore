public class squareDigitsClass {
    public static int squareDigits(int n) {
        StringBuilder result = new StringBuilder();
        String number = Integer.toString(n);
        for (char x : number.toCharArray()) {
            result.append((x - '0') * (x - '0'));
        }
        return Integer.parseInt(result.toString());
    }
}
