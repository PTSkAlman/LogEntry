import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {

    private View view;
    private Loggbok logg = new Loggbok(new LogEntry("Logbook created", "You"));

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
                int option = JOptionPane.showConfirmDialog(f,"Are you sure?");
                if (option == JOptionPane.YES_OPTION) {
                    for (int i = logg.size()-1; i != -1; i--) {
                        logg.remove(i);
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
                logg.setEntryArrayList(logg.load("testSave"));
                update();
            }
        });
    }

    private void update() {
        if (logg != null) {
            view.getMessage(logg.sendMessage());
            view.getAuthor(logg.sendAuthor());
            view.getDate(logg.sendDate());
        }
    }
}
