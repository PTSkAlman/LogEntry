import sun.rmi.runtime.Log;

import java.io.*;
import java.util.ArrayList;


public class Loggbok {
    private LogEntry entry;
    private ArrayList<LogEntry> entryArrayList;

    public Loggbok() {

    }

    public Loggbok(LogEntry entry) {
        entryArrayList = new ArrayList<LogEntry>();
        entryArrayList.add(entry);
    }

    public void add(LogEntry entry) {
        entryArrayList.add(entry);
    }

    public void remove(int index) {
        entryArrayList.remove(index);
    }

    public int size() {
        int i = 0;
        for (int j = 0; j < entryArrayList.size(); j++) {
            i++;
        }
        return i;
    }

    public ArrayList<LogEntry> getEntryArrayList() {
        return entryArrayList;
    }

    public void setEntryArrayList(ArrayList<LogEntry> entryArrayList) {
        this.entryArrayList = entryArrayList;
    }

    @Override
    public String toString() {
        return "Loggbok{" +
                "entryArrayList=" + entryArrayList +
                "}";
    }

    public String sendMessage() {
        String s = "";
        for (int i = 0; i < entryArrayList.size(); i++) {
            s += entryArrayList.get(i).getMessage() + "\n";
        }
        return s;
    }
    public String sendAuthor() {
        String s = "";
        for (int i = 0; i < entryArrayList.size(); i++) {
            s += entryArrayList.get(i).getAuthor() + "\n";
        }
        return s;
    }
    public String sendDate() {
        String s = "";
        for (int i = 0; i < entryArrayList.size(); i++) {
            s += entryArrayList.get(i).getDate() + "\n";
        }
        return s;
    }

    public void save(String filename) {
        try {
            ObjectOutputStream outs = new ObjectOutputStream(new FileOutputStream(new File(filename)));
            outs.writeObject(entryArrayList);
            outs.flush();
            outs.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<LogEntry> load(String filename) {
        ArrayList<LogEntry> l = new ArrayList<LogEntry>();
        try {
            ObjectInputStream ins = new ObjectInputStream(new FileInputStream(new File(filename)));
            l = (ArrayList<LogEntry>) ins.readObject();
            ins.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return l;
    }
}
