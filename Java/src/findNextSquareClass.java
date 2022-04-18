public class findNextSquareClass {
    public static long findNextSquare(long sq) {
        if (Math.sqrt(sq) % 1 == 0) {
            return (long)((Math.sqrt(sq) + 1) * (Math.sqrt(sq) + 1));
        }
        return -1;
    }
}
