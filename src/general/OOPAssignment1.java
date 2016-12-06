package general;
import hr.*;
import products.*;
import java.time.LocalDate;
import java.time.Month;
import java.util.*;


/**
 *
 * @author Kojak
 */
public class OOPAssignment1
{
    public static void main(String[]args) {                                                                                     
      Scanner keyboard = new Scanner(System.in);                                                                              
      ArrayList<Employee> EmployeeArrayList = new ArrayList<>();                                                              
      ArrayList<Product> ProductArrayList = new ArrayList<>();                                                                
      CommissionSalesEmployee commissionEmp;                                                                                  
      HourlyEmployee hourlyEmp;                                                                                               
      SalaryEmployee salaryEmp;                                                                                               
      String empSearch;                                                                                                       
      String productSearch;                                                                                                   
      boolean keepGoing = true, empCreation = true;                                                                           
      int input;                                                                                                              
                                                                                                                              
                                                                                                                              
      Product test1 = new Product("Carpet",new Manufacturer("THEManufacturer", "1 Georgian Dr, Barrie","L4N6W2","555-5555"),10.00);
      Product test2 = new Product("Door Knob",new Manufacturer("THEManufacturer", "1 Georgian Dr, Barrie","L4N6W2","555-5555"),12.00);
      Product test3 = new Product("Television",new Manufacturer("THEManufacturer", "1 Georgian Dr, Barrie","L4N6W2","555-5555"), 15.00);
                                                                                                                              
      ProductArrayList.add(test1);                                                                                            
      ProductArrayList.add(test2);                                                                                            
      ProductArrayList.add(test3);                                                                                            
                                                                                                                              
                                                                                                                              
      do {                                                                                                                    
          ServiceClass.getInitialMessage();                                                                                   
          input = keyboard.nextInt();                                                                                         
                                                                                                                              
          if (input == 0) {                                                                                                   
              keepGoing = false; 
              ServiceClass bye = new ServiceClass();
              bye.goodbyeMessage();
          } else if (input == 1) {                                                                                            
              //search employees                                                                                              
              if(EmployeeArrayList.size() != 0) {                                                                             
                                                                                                                              
              System.out.println("\nPlease enter the name of the employee:\n");                                               
              empSearch = keyboard.next();                                                                                    
                  for (int i = 0; i < EmployeeArrayList.size(); i++) {                                                        
                      if (EmployeeArrayList.get(i).getFullName().contains(empSearch)) {                                       
                          System.out.println("\nEmployee Found!\n");                                                          
                          System.out.println(EmployeeArrayList.get(i).toString());                                            
                                                                                                                              
                      } else {                                                                                                
                          System.out.println("\nEmployee Not Found! ");                                                       
                      }                                                                                                       
                  }                                                                                                           
              }else{                                                                                                          
                  System.out.println("\nThere are currently no employees! \n");                                               
              }                                                                                                               
          }else if(input == 2){                                                                                               
              //create hourly employee                                                                                        
              hourlyEmp = createHourlyEmployee();                                                                             
              EmployeeArrayList.add(hourlyEmp);                                                                               
              ServiceClass.employeeCreated();                                                                                 
          } else if (input == 3) {                                                                                            
              //create commission employee                                                                                    
              commissionEmp = createCommissionSalesEmployee();                                                                
              EmployeeArrayList.add(commissionEmp);                                                                           
              ServiceClass.employeeCreated();                                                                                 
          } else if (input == 4) {                                                                                            
              //create salary employee                                                                                        
              salaryEmp = createSalaryEmployee();                                                                             
              EmployeeArrayList.add(salaryEmp);                                                                               
              ServiceClass.employeeCreated();                                                                                 
          } else if( input == 5){                                                                                             
              //search products                                                                                               
           if(ProductArrayList.size() != 0) {                                                                                 
                                                                                                                              
           System.out.println("\nPlease enter the name of the product:\n");                                                   
           productSearch = keyboard.next();                                                                                   
               for (int i = 0; i < ProductArrayList.size(); i++) {                                                            
                   if (ProductArrayList.get(i).getProductName().contains(productSearch)) {                                    
                       System.out.println("\nProduct Found!\n");                                                              
                       System.out.println(ProductArrayList.get(i).toString());                                                
                                                                                                                              
                   } else {                                                                                                   
                       System.out.println("\nProduct Not Found! ");                                                           
                   }                                                                                                          
               }                                                                                                              
           }else{                                                                                                             
               System.out.println("\nThere are currently no products! \n");                                                   
           }                                                                                                                  
                                                                                                                              
          }else {                                                                                                             
              ServiceClass.invalidInput();                                                                                    
          }                                                                                                                   
      } while (keepGoing);                                                                                                    
  }
    
//method to create commission employee and display result
  public static CommissionSalesEmployee createCommissionSalesEmployee(){
        Scanner keyboard = new Scanner(System.in);
        String first, last, address, phone, gender, department,
                position, status;
        int byear,hyear,bmonth,hmonth,bday,hday, sin;
        LocalDate dob, doh;
        double commissionRate, grossSales;

        System.out.println("\nCommission Sales Employee Creation:\n");

        System.out.printf("First Name: ");
        first = keyboard.nextLine();
        System.out.printf("LastName: ");
        last = keyboard.nextLine();
        System.out.printf("Address: ");
        address = keyboard.nextLine();
        System.out.printf("Phone Number: ");
        phone = keyboard.nextLine();
        System.out.printf("SIN: ");
        sin = Integer.parseInt(keyboard.nextLine());
        System.out.printf("Gender: ");
        gender = keyboard.nextLine();
        System.out.printf("Department: ");
        department = keyboard.nextLine();
        System.out.printf("Position: ");
        position = keyboard.nextLine();
        System.out.printf("Status: ");
        status = keyboard.nextLine();
        System.out.printf("Year of Birth: ");
        byear = Integer.parseInt(keyboard.nextLine());
        System.out.printf("Month of Birth: ");
        bmonth = Integer.parseInt(keyboard.nextLine());
        System.out.printf("Day of Birth: ");
        bday = Integer.parseInt(keyboard.nextLine());
        System.out.printf("Year Hired: ");
        hyear = Integer.parseInt(keyboard.nextLine());
        System.out.printf("Month Hired: ");
        hmonth = Integer.parseInt(keyboard.nextLine());
        System.out.printf("Day Hired: ");
        hday = Integer.parseInt(keyboard.nextLine());
        System.out.printf("Gross Sales: ");
        grossSales = Double.parseDouble(keyboard.nextLine());
        System.out.printf("Commission Rate: ");
        commissionRate = Double.parseDouble(keyboard.nextLine());

        //Date of hire
        dob = LocalDate.of(byear, Month.of(bmonth), bday);
        //Date of birth
        doh = LocalDate.of(hyear, Month.of(hmonth), hday);

        CommissionSalesEmployee tempCommEmp = new CommissionSalesEmployee(first, last, address, phone,
                sin, gender, department, position, status, dob, doh, commissionRate,grossSales);

        System.out.printf(tempCommEmp.toString());

        return tempCommEmp;
    }
  //method to create hourly employee and display result
    public static HourlyEmployee createHourlyEmployee(){
        Scanner keyboard = new Scanner(System.in);
        String first, last, address, phone, gender, department,
                position, status;
        int byear,hyear,bmonth,hmonth,bday,hday, sin;
        LocalDate dob, doh;
        double hourlyWage, hoursWorked;

        System.out.println("\nHourly Employee Creation:\n");


        System.out.printf("First Name: ");
        first = keyboard.nextLine();
        System.out.printf("LastName: ");
        last = keyboard.nextLine();
        System.out.printf("Address: ");
        address = keyboard.nextLine();
        System.out.printf("Phone Number: ");
        phone = keyboard.nextLine();
        System.out.printf("SIN: ");
        sin = Integer.parseInt(keyboard.nextLine());
        System.out.printf("Gender: ");
        gender = keyboard.nextLine();
        System.out.printf("Department: ");
        department = keyboard.nextLine();
        System.out.printf("Position: ");
        position = keyboard.nextLine();
        System.out.printf("Status: ");
        status = keyboard.nextLine();
        System.out.printf("Year of Birth: ");
        byear = Integer.parseInt(keyboard.nextLine());
        System.out.printf("Month of Birth: ");
        bmonth = Integer.parseInt(keyboard.nextLine());
        System.out.printf("Day of Birth: ");
        bday = Integer.parseInt(keyboard.nextLine());
        System.out.printf("Year Hired: ");
        hyear = Integer.parseInt(keyboard.nextLine());
        System.out.printf("Month Hired: ");
        hmonth = Integer.parseInt(keyboard.nextLine());
        System.out.printf("Day Hired: ");
        hday = Integer.parseInt(keyboard.nextLine());
        System.out.printf("Hourly Wage: ");
        hourlyWage = Double.parseDouble(keyboard.nextLine());
        System.out.printf("Hours Worked: ");
        hoursWorked = Double.parseDouble(keyboard.nextLine());

        //Date of hire
        dob = LocalDate.of(byear, Month.of(bmonth), bday);
        //Date of birth
        doh = LocalDate.of(hyear, Month.of(hmonth), hday);

        HourlyEmployee tempHourly = new HourlyEmployee(first, last, address, phone,
                sin, gender,
                department, position, status, dob, doh, hourlyWage,
                hoursWorked);

        System.out.printf(tempHourly.toString());

        return tempHourly;
    }

    //create salary employee and display the result
    public static SalaryEmployee createSalaryEmployee(){
        Scanner keyboard = new Scanner(System.in);
        String first, last, address, phone, gender, department,
                position, status;
        int byear,hyear,bmonth,hmonth,bday,hday, sin;
        LocalDate dob, doh;
        double salary;

        System.out.println("\nSalary Employee Creation:\n");


        System.out.printf("First Name: ");
        first = keyboard.nextLine();
        System.out.printf("LastName: ");
        last = keyboard.nextLine();
        System.out.printf("Address: ");
        address = keyboard.nextLine();
        System.out.printf("Phone Number: ");
        phone = keyboard.nextLine();
        System.out.printf("SIN: ");
        sin = Integer.parseInt(keyboard.nextLine());
        System.out.printf("Gender: ");
        gender = keyboard.nextLine();
        System.out.printf("Department: ");
        department = keyboard.nextLine();
        System.out.printf("Position: ");
        position = keyboard.nextLine();
        System.out.printf("Status: ");
        status = keyboard.nextLine();
        System.out.printf("Year of Birth: ");
        byear = Integer.parseInt(keyboard.nextLine());
        System.out.printf("Month of Birth: ");
        bmonth = Integer.parseInt(keyboard.nextLine());
        System.out.printf("Day of Birth: ");
        bday = Integer.parseInt(keyboard.nextLine());
        System.out.printf("Year Hired: ");
        hyear = Integer.parseInt(keyboard.nextLine());
        System.out.printf("Month Hired: ");
        hmonth = Integer.parseInt(keyboard.nextLine());
        System.out.printf("Day Hired: ");
        hday = Integer.parseInt(keyboard.nextLine());
        System.out.printf("Employee Salary: ");
        salary = Double.parseDouble(keyboard.nextLine());

        //Date of hire
        dob = LocalDate.of(byear, Month.of(bmonth), bday);
        //Date of birth
        doh = LocalDate.of(hyear, Month.of(hmonth), hday);

        SalaryEmployee tempSalary = new SalaryEmployee(first, last, address, phone,
                sin, gender, dob, doh,
                department, position, status, salary);

        System.out.printf(tempSalary.toString());

        return tempSalary;
    }

}