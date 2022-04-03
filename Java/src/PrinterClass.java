import javax.swing.*;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.net.SocketOption;

public class PrinterClass {

    public static String printerError(String s) {
        int len = 0;
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) > 'm')
                len++;
        }
        return String.valueOf(len) + "/" + String.valueOf(s.length());
    }
}

/*public class Printer {

    public static String printerError(String s) {
        return s.replaceAll("[a-m]", "").length() + "/" + s.length();
    }
}*/