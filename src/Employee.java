/**
* A brief description of the project
* Date
* CSC 251  - The Employee and ProductionWorker Classes Problem
* @author Your Name
*/
public class Employee 
{
    private String name;                //Employee name
    private String employeeNumber;      //Employee number
    private String hireDate;            //Employee hire date
            
    /**
     * This constructor initialized an object with a name
     * employee number and hire date
     * @param n the employee name
     * @param num the employee number
     * @param date the employee hire date
     */
    
    public Employee(String n, String num, String date)
    {
        name = n;
        setEmployeeNumber(num);
        hireDate = date;
    }
            
    /** The no-arg constructor initialized an object with null strings for name:
     * employee number and hire date
     */
    
    public Employee()
    {
        name = "";
        employeeNumber = "";
        hireDate = "";
    }

    /** The setName method sets the employee's name 
     * @param n the employees name
     */
    
    public void setName(String n)
    {
        name = n;
    }
    
    /** The setEmployeeNumber method sets the employee's number
     * @param e the employee number
     * 
     */
    
    public void setEmployeeNumber(String e)
    {
        if ( isValidEmpNum(e))
        {
            employeeNumber = e;
        }
        else
        {
            employeeNumber = "";
        }
    }
    
    /**
     * The setHire date method sets the employee's hire date.
     * @param h The employee hire date
     * 
     */
    
    public void setHireDate(String h)
    {
        hireDate = h;
    }
    
    /** The getName method returns the employee name
     * @return  the employee name
     */
    
   public String getName()
   {
       return name;
   }
   
   /** the getEmployeeNumber method returns the employee number
    * @return the employee number
    * 
    */
   
   public String getEmployeeNumber()
   {
       return employeeNumber;
   }
   
   /**
    * the getHireDate method returns the employee hire date
    * @return the employee hire date
    * 
    */
   
   public String getHireDate()
   {
       return hireDate;
   }
   
   /**
    * isValidEmpNum is a private method that determines whether a string is a
    * valid employee number
    * @param e The String containing an employee number
    * @return true if e reference a valid ID number false otherwise
    * 
    */
   
   private boolean isValidEmpNum(String e)
   {
       boolean status = true;
       if (e.length() != 5)
       {
           status = false;
       }
       else
       {
           if (!e.matches("\\d{3}-[A-M]"))
           {
               status = false;
           }
       }
       return status;
   }
   
   /**
    * to String method
    * @return A reference to a String representation of the object
    */
   
   public String toString()
   {
       String str = "Name: " + name + "\nEmployee Number: ";
       
       if (employeeNumber == "")
       {
           str += "INVALID EMPLOYEE NUMBER";
       }
       else
       {
           str += employeeNumber;
       }
       
       str += ("\nHIre Date: " + hireDate);
       return str;
   }
       
}
