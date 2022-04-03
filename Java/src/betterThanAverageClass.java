public class betterThanAverageClass {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int result = 0;
        for (int i = 0; i < classPoints.length; i++) {
            result += classPoints[i];
        }
        result /= classPoints.length;
        return yourPoints > result;
    }
}
