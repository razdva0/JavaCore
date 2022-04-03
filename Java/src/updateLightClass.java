import java.util.Objects;

public class updateLightClass {
    public static String updateLight(String current) {
        if (Objects.equals(current, "red")) return "green";
        if (Objects.equals(current, "green")) return "yellow";
        if (Objects.equals(current, "yellow")) return "red";
        return "";
    }
}
