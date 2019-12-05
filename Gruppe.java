import java.util.ArrayList;
/**
 * Write a description of class Gruppe here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Gruppe
{
    // instance variables - replace the example below with your own
    private ArrayList<Spieler> gruppe;

    /**
     * Constructor for objects of class Gruppe
     */
    public Gruppe()
    {
        
    }
    
    public void addGruppe(Spieler spieler)
    {
        getGruppe().add(spieler);
    }
    
    public void removeGruppe(Spieler spieler)
    {
        getGruppe().remove(spieler);
    }
    
    public void setGruppe(ArrayList gruppe)
    {
        this.gruppe = gruppe;
    }
    public ArrayList getGruppe()
    {
        return this.gruppe;
    }
}
