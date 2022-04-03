import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        boolean result = XOClass.getXO("opopxoxo");
        if (!result)
            System.out.println("OK");
        else
            System.out.println(result);
    }
}