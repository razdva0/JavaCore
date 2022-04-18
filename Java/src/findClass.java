public class findClass {
    static Integer find(final int[] array) {
        int tmp;
        for(int i = 0; i < array.length - 1; i++) {
            tmp = array[i] - array[i + 1];
            if (tmp != -1){
                return array[i + 1];
            }
        }
        return null;
    }
}
