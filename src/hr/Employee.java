/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr;
import general.ServiceClass;
import java.time.LocalDate;
import java.util.*;

/**
 *
 * @author Kojak
 */
public abstract class Employee 
{
    //superclass variables
    private String firstName, lastName,position, status, gender,
            address, phoneNumber, department;
    private int empId, sin;
    private LocalDate dateOfBirth, dateOfHire, LocalDate;
    private static int employeeCount;
//constructors
    public Employee()
    {}

    public Employee(String firstName, String lastName, String address,
                    String phoneNumber, int sin, String gender, LocalDate dateOfBirth, LocalDate dateOfHire)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.sin = sin;
        this.gender = gender;
        this.dateOfHire = dateOfHire;
        this.dateOfBirth = dateOfBirth;
        this.LocalDate = LocalDate.now();
        empId=ServiceClass.getEmployeeId();
        employeeCount++;
    }
    public Employee(String firstName, String lastName, String address,
                    String phoneNumber, int sin, String gender, LocalDate dateOfBirth, LocalDate dateOfHire,
                    String department, String position, String status)
    {
        this(firstName, lastName, address,phoneNumber, sin, gender, dateOfBirth, dateOfHire);
        this.department = department;
        this.position = position;
        this.status = status;
    }

    //******Accessor (get) methods********\\

    public String getFirstName()
    {
        return this.firstName;
    }
    public String getLastName()
    {
        return this.lastName;
    }
    public String getFullName()
    {
        return this.firstName + " " + this.lastName;
    }
    public String getAddress()
    {
        return this.address;
    }
    public String getPhoneNumber()
    {
        return this.phoneNumber;
    }
    public int getSin()
    {
        return this.sin;
    }
    public String getGender()
    {
        return this.gender;
    }
    public String getDepartment()
    {
        return this.department;
    }
    public String getPosition()
    {
        return this.position;
    }
    public int getEmployeeId()
    {
        return this.empId;
    }
    public String getEmployeeStatus()
    {
        return this.status;
    }
    public LocalDate getDateOfBirth()
    {
        return this.dateOfBirth;
    }
    
    //method uses current date and subtracts the date of birth
    public int getAge()
    {
        return this.LocalDate.getYear() - this.dateOfBirth.getYear();
    }
    //return the date of hire
    public LocalDate getDateOfHire()
    {
        return this.dateOfHire;
    }

    //****Mustator Method****\\
    public void setFirstName(String firstName)
    {
        this.firstName=firstName;
    }
    public void setLastName(String lastName)
    {
        this.lastName=lastName;
    }
    public void setAddress(String address)
    {
        this.address=address;
    }
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber=phoneNumber;
    }
    public void setSin(int sin)
    {
        this.sin=sin;
    }
    public void setGender(String gender)
    {
        this.gender=gender;
    }
    public void setDepartment(String department)
    {
        this.department=department;
    }
    public void setPosition(String position)
    {
        this.position=position;
    }
    public void setEmployeeStatus(String status)
    {
        this.status=status;
    }
    public void setDateOfBirth()
    {
        this.dateOfBirth = dateOfBirth;
    }
    //return the date of hire
    public void setDateOfHire(int year,int month, int day)
    {
        this.dateOfHire = dateOfHire;
    }

    public abstract double calculateEarnings();
    //toString method
    @Override
    public String toString()
    {
        String employeeInfo="";

        /*add the following info

        */
        employeeInfo+= "\nName:\t\t" + getFullName();
        employeeInfo+= "\nAge:\t\t" + getAge();
        employeeInfo+= "\nPosition:\t" + getPosition();
        employeeInfo+= "\nEmployee Id:\t" + getEmployeeId();
        employeeInfo+= "\nHire Date:\t" + getDateOfHire();

        return employeeInfo;
    }

    
            
    
}