//STEP 1
//Employee Wage Computation Problem
//Start with Displaying Welcome to Employee Wage Computation Program on Master Branch
//STEP 2
//Check Employee is Present or Absent
//- Use ((RANDOM)) for AttendanceCheck
//STEP 3
//Calculate Daily Employee Wage
//Assume Wage Per Hour is 20
//Assume FullDay Hour is 8
//STEP 4
//Add Part time Employee & wage
//Assume Part Time Hour is 8
//STEP 5
//Solving using Switch Case Statement
//STEP 6
//Calculating Wages For A Month
//Assume 20 Working Day Per Month
//STEP 7
//Calculate Wages till a condition of total working hours or days is reached for a month
// - Assume 100 hours and 20 days.
package EmployeeWage;
import java.util.Random;
public class EmployeeWage {
    public static void main(String args[]) {


        {
            System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
            Random att = new Random();
            int a = att.nextInt(2);
            if (a == 0) {
                System.out.println("employee is absent");
            } else {
                System.out.println("employee is present");
            }
            //UC2
            int wagePerHour = 20;
            int fullDay = 8;
            int dailyWage = (wagePerHour * fullDay);
            System.out.println("Daily employee Wage is  " + dailyWage);
            //UC3
            int partTimeWage = 10;
            int partTimeHour = 8;
            int partimeWage = (partTimeWage * partTimeHour);
            System.out.println("Part time wage is  " + partimeWage);

            //UC4
            switch (a) {
                case 0:
                    System.out.println("Absent");
                    break;
                case 1:
                    System.out.println("Present");
                    break;
            }
            //UC5
            int workingDayMonth = 20;
            int wageInMonth = (workingDayMonth * dailyWage);
            System.out.println("Wage in a month is  " + wageInMonth);
//UC6
            int workingHours = 0;
            int workingDay = 0;
            int wage;
            while (workingHours <= 100 || workingDay <= 20) {
                wage = workingHours * workingDay;
                workingHours++;
                workingDay++;
        }
    }
}

