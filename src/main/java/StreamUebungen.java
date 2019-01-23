import java.util.ArrayList;

public class StreamUebungen {

    private static ArrayList<Lehrer> lehrerListe = new ArrayList<Lehrer>() {
        {
            add(new Lehrer(1, "Heinz", "Müller"));
            add(new Lehrer(2, "Gustav", "Ganz"));
            add(new Lehrer(3, "Antonio", "Troiano"));
        }
    };

    public static void main(String[] args) {
        String lehrerVorname = "Antonio";
        Lehrer lehrer = lehrerListe.stream().filter(c -> c.getLehrerVorname() == lehrerVorname).findFirst().orElse(null);
        System.out.println(lehrer);
    }
}
