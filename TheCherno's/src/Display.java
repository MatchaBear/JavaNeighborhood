import java.awt.*;
import javax.swing.JFrame;

public class Display extends Canvas {
    public static final int width = 1024;
    public static final int height = 768;
    public static final String title = "Minefront Pre-Alpha 0.01";

    public static void main(String[] args) {
        Display game = new Display();
        JFrame frame = new JFrame();
        frame.add(game);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // kalo ini gak ada, harus stop paksa, lalu exit code -1
        frame.setSize(width,height);
        frame.setResizable(false);
        frame.setTitle(title);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.pack();

        System.out.println("Running...");

    }


}
