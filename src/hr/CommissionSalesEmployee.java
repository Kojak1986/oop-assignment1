package hr;

import java.time.LocalDate;

/**
 *
 * @author Kojak
 */
public class CommissionSalesEmployee extends Employee {
    private double commissionRate, grossSales;

    public CommissionSalesEmployee(String firstName, String lastName, String address, String phoneNumber, int sin,String gender,
                          String department, String position,String status, LocalDate dateOfBirth, LocalDate dateOfHire,
                          double commissionRate, double grossSales)
    {
        super(firstName, lastName, address, phoneNumber, sin, gender, dateOfBirth, dateOfHire, department, position, status);
        {
            this.commissionRate = commissionRate;
            this.grossSales = grossSales;
        }
    }

    //****Accessor Methods*****\\

    public double getCommissionRate()
    {
        return this.commissionRate;
    }

    public double getGrossSales()
    {
        return this.grossSales;
    }
    //***Mutator methods***\\
    public void setCommissionRate(double commissionRate)
    {
        this.commissionRate = commissionRate;
    }
    public void setGrossSales(double grossSales)
    {
        this.grossSales = grossSales;
    }

    @Override
    public double calculateEarnings()
    {
        return this.grossSales * this.commissionRate;
    }

    @Override
    public String toString()
    {
        return super.toString() +
                "\nCommission Rate:\t" + getCommissionRate() +
                "\nGross Sales:\t" + getGrossSales() +
                "\nEarnings: \t" + calculateEarnings();
    }
}