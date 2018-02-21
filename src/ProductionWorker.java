/**
* A brief description of the project
* Date
* CSC 251  - The Employee and ProductionWorker Classes Problem
* @author Your Name
*/
public class ProductionWorker extends Employee
{
    // Constants for the day and night shift
    public static final int DAY_SHIFT = 1;
    public static final int NIGHT_SHIFT = 2;
    
    private int shift;          //The employee shift
    private double payRate;     //The employee pay rate
    
    /**
     * The constructor initializes an object with a name,
     * employee number, hire date, shift, and pay rate
     * @param n the employee name
     * @param num the employee number
     * @param date the employee hire date
     * @param sh the employee shift
     * @param rate the employee pay rate
     *  
     */
    
    public ProductionWorker(String n, String num, String date, int sh, double rate)
    {
        super(n, num, date);
        shift = sh;
        payRate = rate;
    }
    
    /**
     * The no-arg constructor initializes an object with null strings for name,
     * employee number, and hire date. The day shift is selected, and the pay
     * rate is set to 0.0
     */
    
    public ProductionWorker()
    {
        super();
        shift = DAY_SHIFT;
        payRate = 0.0;
    }
    
    /**
     * the setShift method sets the employee shift
     * @param s the employee shift
     * 
     */
    
    public void setShift(int s)
    {
        shift = s;
    }
    
    /** the setPayrate method sets the meploee pay rate
     * @param p the employee pay rate
     */
    
    public void setPayRate(double p )
    {
        payRate = p;
    }
    
    /** the getShift method returns the employee shift
     * @return the employee shift
     */
    
    public int getShift()
    {
        return shift;
    }
     
    /**
     * the getPayRate method returns the employee pay rate
     * @return the employee pay rate
     */
    public double getPayRate()
    {
        return payRate;
    }
    
    /** toString method
     *  @return a reference to a string representation of the object
     */
    
    @Override
    public String toString()
    {
        String str = super.toString();
        
        str +="\nShift: ";
        if (shift == DAY_SHIFT)
        {
            str += "Day";
        }
        else if (shift  == NIGHT_SHIFT)
        {
            str += "Night";
        }
        else
        {
            str += "INVALID SHIFT NUMBER";
        }
            str += String.format("\nHourly Pay Rate : $%,.2f", payRate);
        
        return str;
    }
    
                 
}
