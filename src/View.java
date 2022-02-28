import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    private JLabel newMessageLable;
    private JLabel newAuthorLabel;
    private JButton addButton;
    private JMenuBar menuBar = new JMenuBar();
    private JMenu menu = new JMenu("File");
    private JMenuItem newItem = new JMenuItem("New");
    private JMenuItem saveItem = new JMenuItem("Save");
    private JMenuItem loadItem = new JMenuItem("Load");


    public View(String name) {
        frame = new JFrame(name);
        frame.setPreferredSize(new Dimension(800,800));
        menuBar.add(menu);
        menu.add(newItem);
        menu.add(saveItem);
        menu.add(loadItem);
        frame.setJMenuBar(menuBar);
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

    public JFrame sendFrame() {
        return frame;
    }

    public JButton sendButton() {
        return addButton;
    }

    public JMenuItem sendNew() {
        return newItem;
    }

    public JMenuItem sendSave() {
        return saveItem;
    }

    public JMenuItem sendLoad() {
        return loadItem;
    }

    public String sendMessageField() {
        return messageField.getText();
    }

    public String sendAuthorField() {
        return authorField.getText();
    }
}
