/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr;

import java.time.LocalDate;

/**
 *
 * @author Kojak
 */
public class SalaryEmployee extends Employee 
{
    private double salary;

    public SalaryEmployee(String firstName, String lastName, String address, String phoneNumber,
                          int sin, String gender, LocalDate dateOfBirth, LocalDate dateOfHire,
                          String department, String position, String status,
                          double salary)
    {
        super(firstName, lastName, address, phoneNumber, sin, gender, dateOfBirth, dateOfHire,
              department, position, status);
        
        this.salary = salary;
    }

    public double getSalary() 
    {
        return salary;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    @Override
    public String toString()
    {
        return super.toString() +
                "\nSalary:\t" + getSalary();
        
    }


    @Override
    public double calculateEarnings()
    {
        return getSalary();
    }
}