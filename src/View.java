import javax.swing.*;
import java.awt.*;

public class View {

    private JFrame frame;
    private JPanel panel;
    private JLabel messageLabel;
    private JLabel authorLabel;
    private JLabel dateLabel;
    private JTextArea messageArea;
    private JTextArea authorArea;
    private JTextArea dateArea;
    private JTextField messageField;
    private JTextField authorField;
    private JMenuBar menuBar = new JMenuBar();
    private JMenu menu = new JMenu("File");
    private JMenuItem saveButton = new JMenuItem("Save");
    private JMenuItem loadButton = new JMenuItem("Load");


    public View(String name) {
        frame = new JFrame(name);
        frame.setPreferredSize(new Dimension(800,800));
        menuBar.add(menu);
        menu.add(saveButton);
        menu.add(loadButton);
        frame.add(menuBar);
        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
    }

    public void getMessage(String s) {
        messageArea.setText(s);
    }

    public void getAuthor(String s) {
        authorArea.setText(s);
    }

    public void getDate(String s) {
        dateArea.setText(s);
    }
}
