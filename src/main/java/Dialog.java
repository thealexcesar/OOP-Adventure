import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Dialog {
    public static void main(String[] args) {
        URL imageLocation = null;
        try {
            imageLocation = new URL("https://www.unilever.com.br/core-assets/logos/logo-animated.svg");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        JOptionPane.showMessageDialog(null, "Hello", "Title", JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
        System.exit(0);
    }
}
