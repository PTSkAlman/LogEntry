import java.io.*;
import java.util.ArrayList;


public class Loggbok {
    private LogEntry entry;
    private ArrayList<LogEntry> entryArrayList;
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

    public ArrayList<LogEntry> getEntryArrayList() {
        return entryArrayList;
    }

    @Override
    public String toString() {
        return "Loggbok{" +
                "entryArrayList=" + entryArrayList +
                "}";
    }

    public String getMessage() {
        String s = "";
        for (int i = 0; i < entryArrayList.size(); i++) {
            s += entryArrayList.get(i).getMessage() + "\n";
        }
        return s;
    }
    public String getAuthor() {
        String s = "";
        for (int i = 0; i < entryArrayList.size(); i++) {
            s += entryArrayList.get(i).getAuthor() + "\n";
        }
        return s;
    }
    public String getDate() {
        String s = "";
        for (int i = 0; i < entryArrayList.size(); i++) {
            s += entryArrayList.get(i).getDate() + "\n";
        }
        return s;
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

    public ArrayList<LogEntry> load() {
        ArrayList<LogEntry> l = new ArrayList<LogEntry>();
        try {
            ObjectInputStream ins = new ObjectInputStream(new FileInputStream(new File("testSave")));
            l = (ArrayList<LogEntry>) ins.readObject();
            ins.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return l;
    }
}
