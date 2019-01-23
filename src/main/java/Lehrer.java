public class Lehrer {
    private int idLehrer;
    private String lehrerVorname;
    private String lehrerNachname;

    public Lehrer() {
    }

    public Lehrer(int idLehrer, String lehrerVorname, String lehrerNachname) {
        this.idLehrer = idLehrer;
        this.lehrerVorname = lehrerVorname;
        this.lehrerNachname = lehrerNachname;
    }

    public int getIdLehrer() {
        return idLehrer;
    }

    public void setIdLehrer(int idLehrer) {
        this.idLehrer = idLehrer;
    }

    public String getLehrerVorname() {
        return lehrerVorname;
    }

    public void setLehrerVorname(String lehrerVorname) {
        this.lehrerVorname = lehrerVorname;
    }

    public String getLehrerNachname() {
        return lehrerNachname;
    }

    public void setLehrerNachname(String lehrerNachname) {
        this.lehrerNachname = lehrerNachname;
    }

    @Override
    public String toString() {
        return lehrerVorname + " " + lehrerNachname;
    }
}
