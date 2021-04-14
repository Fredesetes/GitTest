import javax.swing.*;
import java.awt.*;

public class HelloWorld extends JFrame{
    private JPanel mainpanel;
    private JLabel lblMensagem;

    public HelloWorld(String title) throws HeadlessException {
        super(title);

        setContentPane(mainpanel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();

    }

    public static void main(String[] args) {
        new HelloWorld("Hello Word").setVisible(true);
    }
}
