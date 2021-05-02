
import java.util.Scanner;


/*

Function Challenge:::


Employer works at a company and would like to know gross income

Get number of hours per week employee works at a company ($15.00 = 15,, $15.50 = 15.50)

Get if employee took number of days of unpaid vacation (1 day = 8 hours)

Output employee's gross yearly salary based on hours, rate, and UPTO

*/


/**
 *
 * @author bhakti
 */

public class SalaryCalc 
{
    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        double hoursPerWeek;
        double dollarPerHour;
        int unPaidDays; 
        int totalWeeks = 52;

        hoursPerWeek = hoursPerWeek("How many Hours Per week do you work" , in);
        dollarPerHour = dollarsPerHour("How many dollars per hour do you make", in);
        unPaidDays = unPaidDays("How many unpaid days did you take this year", in);
        
        int hoursPerDay = 8;
        double yearlyhour = hoursPerWeek * totalWeeks;
        double unPaidHours = unPaidDays * hoursPerDay;
        double salary = (yearlyhour * dollarPerHour) - (unPaidHours * dollarPerHour);
        System.out.println("\n Your Gross Salary is: " + salary + "\n");
        
    }
    

    public static double hoursPerWeek(String Question, Scanner pipe)
        {
            System.out.println(Question);
            double temp = pipe.nextDouble();
            return temp;
        }
    public static double dollarsPerHour(String Question, Scanner pipe)
        {
            System.out.println(Question);
            double temp = pipe.nextDouble();
            return temp;
        }
    public static int unPaidDays(String Question, Scanner pipe)
        {
            System.out.println(Question);
            int temp = pipe.nextInt();
            return temp;
        }
        
}


