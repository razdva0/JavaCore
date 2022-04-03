public class Main {
    public static void main(String[] args)
    {
        String str = "b8krpc2rxq6vd fkyi  h0t  _\n" +
                "fyspo0j_\n" +
                "z_\n" +
                " 50 z 0jn89 ypuo  h67nov3hg11_";
        String[] result = StringSplitClass.solution(str);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}