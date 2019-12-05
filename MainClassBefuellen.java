
/**
 * Beschreiben Sie hier die Klasse MainClassBefuellen.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class MainClassBefuellen
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private MainClass mainclass;
    
    /**
     * Konstruktor für Objekte der Klasse MainClassBefuellen
     */
    public MainClassBefuellen(MainClass mainclass)
    {
        setMainClass(mainclass);
        Befuellen();
    }
    
    public void Befuellen()
    {
        
    }
    
    public void setMainClass(MainClass mainclass)
    {
        this.mainclass = mainclass;
    }
    public MainClass getMainClass()
    {
        return this.mainclass;
    }
}
