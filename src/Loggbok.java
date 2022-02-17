import java.io.*;
import java.util.ArrayList;


public class Loggbok {
    LogEntry entry;
    ArrayList<LogEntry> entryArrayList;
    public Loggbok(LogEntry entry) {
        entryArrayList = new ArrayList<>();
        entryArrayList.add(entry);
    }

    public void add(LogEntry entry) {
        entryArrayList.add(entry);
    }

    public void remove(int index) {
        entryArrayList.remove(index);
    }

    public void save() {
        try {
            ObjectOutputStream outs = new ObjectOutputStream(new FileOutputStream(new File("testSave")));
            outs.writeObject(entryArrayList);
            outs.flush();
            outs.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void load() {
        try {
            ObjectInputStream ins = new ObjectInputStream(new FileInputStream(new File("testSave")));

            ArrayList<LogEntry> l = (ArrayList<LogEntry>) ins.readObject();
            ins.close();
            System.out.println(l);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
