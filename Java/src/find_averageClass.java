public class find_averageClass {
    public static double find_average(int[] array){
        if (array.length == 0) return 0;
        double result = 0;
        for (int val : array)
            result += val;
        return result / array.length;
    }
}
