import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamUebungen {

    private static ArrayList<Lehrer> lehrerListe = new ArrayList<Lehrer>() {
        {
            add(new Lehrer(1, "Heinz", "Müller"));
            add(new Lehrer(2, "Gustav", "Ganz"));
            add(new Lehrer(3, "Antonio", "Troiano"));
        }
    };

    public static void main(String[] args) {
        lehrerListe.stream().forEach(c -> System.out.println(c));
        System.out.println();
        Stream.of(lehrerListe).forEach(c -> System.out.println(c));
        System.out.println();
        String lehrerVorname = "Antonio";
        Lehrer lehrer = lehrerListe.stream().filter(c -> c.getLehrerVorname() == lehrerVorname).findFirst().orElse(null);
        System.out.println(lehrer);
    }
}
