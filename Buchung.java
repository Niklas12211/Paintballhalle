
/**
 * Write a description of class Buchung here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Buchung
{
    // instance variables - replace the example below with your own
    private static int counter; //Counter für 

    /**
     * Constructor for objects of class Buchung
     */
    public Buchung()
    {
        // initialise instance variables
        setCounter(getCounter()+1);
    }
    
    
    
    public void setCounter(int counter)
    {
        this.counter = counter;
    }
    public int getCounter()
    {
        return this.counter;
    }
    
}
