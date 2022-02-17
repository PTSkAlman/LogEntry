public class Controller {
    public static void main(String[] args) {
        View view = new View("View");
        Loggbok logg = new Loggbok(new LogEntry("Joe Biden", "Joel Abrahamsson"));
        logg.add(new LogEntry("Take me out to dinner!", "Joel Abrahamsson"));
        logg.save();
        logg.load();
    }
}
