package general;
import hr.*;
 
import java.time.LocalDate;
import java.time.Month;
 
 
/**
 *
 * @author Kojak
 */
public class Test
{
    public static void main(String[]args)
    {
        //test Commission Sales Employee
        Employee testCommEmp = new CommissionSalesEmployee(
                "Test","Commission Sales Employee","testAddress","123456778",
                123456678,"Male","Sales", "Sales Manager", "active", LocalDate.of(1992, Month.of(8), 10), LocalDate.of(2016, Month.of(2),
                2),2000, 0.10);
 
        System.out.println(testCommEmp.getFullName());
        System.out.println(testCommEmp.getDateOfHire());
        System.out.println(testCommEmp.getDateOfBirth());
        System.out.println("********************");
        System.out.println(testCommEmp.toString());
 
        //test Hourly  Employee
        Employee testHourlyEmp = new HourlyEmployee(
                "Test","Commission Sales Employee","testAddress","123456778",
                123456678,"Male", "Sales", "Sales Manager", "active",  LocalDate.of(1992, Month.of(8), 10),LocalDate.of(2016, Month.of(2),
                2),200,0.10);
 
        System.out.println(testHourlyEmp.getFullName());
        System.out.println(testHourlyEmp.getDateOfHire());
        System.out.println(testHourlyEmp.getDateOfBirth());
        System.out.println("********************");
        System.out.println(testHourlyEmp.toString());
 
        //test Salary Employee
        Employee salaryEmp = new SalaryEmployee(
                "Test","Commission Sales Employee","testAddress","123456778",
                123456678,"Male", LocalDate.of(1992, Month.of(8), 10), LocalDate.of(2016, Month.of(2),
                2),"Sales", "Sales Manager", "active",
                 2000);
 
        System.out.println(salaryEmp.getFullName());
        System.out.println(salaryEmp.getDateOfHire());
        System.out.println(salaryEmp.getDateOfBirth());
        System.out.println("********************");
        System.out.println(salaryEmp.toString());
 
 
    }
}