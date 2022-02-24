public class Controller {

    private View view;
    private Loggbok logg = new Loggbok(new LogEntry("Joe Biden", "Joel Abrahamsson"));

    public Controller() {
        this.view = new View("View");
        logg.add(new LogEntry("Take me out to dinner!", "Crackhead"));
        view.getMessage(logg.getMessage());
        view.getAuthor(logg.getAuthor());
        view.getDate(logg.getDate());
    }
}
