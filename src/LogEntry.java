import java.io.Serializable;
import java.util.Date;

public class LogEntry implements Serializable {

    private String message;
    private String author;
    private Date date;

    public LogEntry(String message, String author) {
        this.message = message;
        this.author = author;
        date = new Date();
    }

    @Override
    public String toString() {
        return "LogEntry{" + "message='" + message + '\'' + ", author='" + author + '\'' + ", date=" + date + '}';
    }
}
