/**
* A brief description of the project
* Date
* CSC 251  - The Employee and ProductionWorker Classes Problem
* @author Your Name
*/

public class EmployeeProductionworker
{
    public static void main(String[] args) 
    {
        // Create a ProductionWorker object and pass the initialization
        // data to the constructor
        ProductionWorker pw = 
                new ProductionWorker("John Smith", "123-A", "11-15-2015",
                ProductionWorker.DAY_SHIFT, 26.50);
        
        // Display the data
        System.out.println("Here's the first production worker. ");
        System.out.println(pw);
        
        //Create another ProductionWorker object and use the set methods
        ProductionWorker pw2 = new ProductionWorker();
        pw2.setName("Joan Jones");
        pw2.setEmployeeNumber("222-L");
        pw2.setHireDate("12-12-2015");
        pw2.setShift(ProductionWorker.NIGHT_SHIFT);
        pw2.setPayRate(28.50);
        
        //display the data
        System.out.println("\n Here's the second production worker.");
        System.out.println(pw2);
    }

}
