import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {

    private View view;
    private Loggbok logg = new Loggbok(new LogEntry("Joe Biden", "Joel Abrahamsson"));

    private JButton b;
    private JMenuItem nF, sF, lF;
    private JFrame f;

    public Controller() {
        this.view = new View("View");

        f = view.sendFrame();
        b = view.sendButton();
        nF = view.sendNew();
        sF = view.sendSave();
        lF = view.sendLoad();

        newEntry();
        newFile();
        saveFile();
        loadFile();

        update();
    }

    private void newEntry() {
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (!view.sendMessageField().equals("") || !view.sendAuthorField().equals("")) {
                    logg.add(new LogEntry(view.sendMessageField(), view.sendAuthorField()));
                    update();
                }
            }
        });
    }

    private void newFile() {
        nF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int i = JOptionPane.showConfirmDialog(f,"Are you sure?");
                if (i == JOptionPane.YES_OPTION) {
                    for (int j = 0; j < logg.size(); j++) {
                        logg.remove(j);
                    }
                }
                update();
            }
        });
    }

    private void saveFile() {
        sF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                logg.save("testSave");
            }
        });
    }

    private void loadFile() {
        lF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                logg.load("testSave");
                update();
            }
        });
    }

    private void update() {
        view.getMessage(logg.sendMessage());
        view.getAuthor(logg.sendAuthor());
        view.getDate(logg.sendDate());
    }
}
