
/**
 * Abstract class Mensch - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Mensch
{
    // instance variables - replace the example below with your own
    private int alter;
    private String vorname;
    private String nachname;
    private String adresse;
    public Mensch(int alter, String vorname, String nachname, String adresse)
    {
        setAlter(alter);
        setVorname(vorname);
        setNachname(nachname);
        setAdresse(adresse);
    }
    
    public void setAlter(int alter)
    {
        this.alter = alter;
    }
    public int getAlter()
    {
        return this.alter;
    }
    
    public void setVorname(String vorname)
    {
        this.vorname = vorname;
    }
    public String getVorname()
    {
        return this.vorname;
    }
    
    public void setNachname(String nachname)
    {
        this.nachname = nachname;
    }
    public String getNachname()
    {
        return this.nachname;
    }
    
    public void setAdresse(String adresse)
    {
        this.adresse = adresse;
    }
    public String getAdresse()
    {
        return this.adresse;
    }
}
