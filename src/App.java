import javafx.application.Application;

public class App {
    public static void main(String[] args) {
        Die d1 = new Die();
        Die d2 = new Die();
        if (Math.min(d1.getEyes(), d2.getEyes()) == 1 && Math.max(d1.getEyes(), d2.getEyes()) == 2) {
            System.out.println("Du har slået Meyer");
        }
        else if (Math.min(d1.getEyes(), d2.getEyes()) == 1 && Math.max(d1.getEyes(), d2.getEyes()) == 3) {
            System.out.println("Du har slået lille Meyer");
        }
        else if (d1.getEyes() == d2.getEyes()) {
            System.out.println("Du har slået par " + d1.getEyes());
        }
        else {
            System.out.println("Du har slået " + Math.max(d1.getEyes(), d2.getEyes()) + Math.min(d1.getEyes(), d2.getEyes()));
        }
        Application.launch(Gui.class);
    }
}
