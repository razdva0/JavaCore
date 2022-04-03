public class PaperClass {
    public static int paperWork(int n, int m) {
        if (n >= 0 && m >= 0)
            return n * m;
        return 0;
        //return max(m, 0) * max(n, 0);
        //return (n < 0) || (m < 0) ? 0 : n * m;
    }
}
