
/**
 * Write a description of class Mitarbeiter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Mitarbeiter extends Mensch
{
    // instance variables - replace the example below with your own
    private String firmenstellung;

    /**
     * Constructor for objects of class Mitarbeiter
     */
    public Mitarbeiter(int alter, String vorname, String nachname, String adresse, String firmenstellung)
    {
        super(alter, vorname, nachname, adresse);
        setFirmenstellung(firmenstellung);
    }

    public void setFirmenstellung(String firmenstellung)
    {
        this.firmenstellung = firmenstellung;
    }
    public String getFirmenstellung()
    {
        return this.firmenstellung;
    }
}
