import javax.swing.*;

public class View {
    private JFrame frame;
    private JPanel panel = new JPanel();

    public View(String name) {
        frame = new JFrame(name);
        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(0);
        frame.pack();
    }
}
