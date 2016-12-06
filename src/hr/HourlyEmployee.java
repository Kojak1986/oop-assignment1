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

public class HourlyEmployee extends Employee {
    private double hoursWorked, hourlyRate;
//constructor
    public HourlyEmployee(String firstName, String lastName, String address, String phoneNumber, int sin,String gender,
                          String department, String position,String status, LocalDate dateOfBirth, LocalDate dateOfHire, double hourlyRate,
                          double hoursWorked)
    {
        super(firstName, lastName, address, phoneNumber, sin, gender, dateOfBirth, dateOfHire, department, position, status);
        {
            this.hoursWorked = hoursWorked;
            this.hourlyRate = hourlyRate;
        }
    }


    public double getHoursWorked()
    {
        return this.hoursWorked;
    }
    
    public void setHoursWorked(double hoursWorked)
    {
        this.hoursWorked = hoursWorked;
    }
    
    @Override
    public double calculateEarnings(){
        return this.hourlyRate*this.hoursWorked;
    }

    @Override
    public String toString(){
        return super.toString() + "\nHourly Rate: " + this.hourlyRate + "\n"
                + "Hours Worked: " + getHoursWorked() + "\n"
                + "Earnings: " + calculateEarnings();
    }
}