public class checkClass {
    public static boolean check(Object[] a, Object x) {
        for (var c : a){ //for (Object c : a)
            if (c == x) return true;
        }
        return false;
        //return Arrays.asList(a).contains(x);
    }
}
