package Assignments.Exercises.BasicSortingAndSearch;

import java.util.Arrays;

/*
Write a class Employee, which represents an employee in a company.
The employee has a employeeNumber (9 digit number), firstName, lastName and emailId as member variables.
Create a few employee objects and store them in an array.
Write the insertion sort algorithm, which takes an array of employee and sorts them in order of their employee number.
 */
public class EmployeeSorter {

    public Employee[] employees;

    public EmployeeSorter(int size){
        this.employees = new Employee[size];
    }

    public void sort(){
        for(int i=0; i<=this.employees.length-1; i++){
            Employee current = employees[i];
            int j = i-1;
            while(j>=0 && this.employees[j].getEmployeeNumber() > current.getEmployeeNumber()){
                this.employees[j+1] = this.employees[j];
                j--;
            }
            this.employees[j+1] = current;
        }
    }

    public static void main(String[] args) {
        EmployeeSorter sorter = new EmployeeSorter(4);
        Employee emp1 = new Employee(100000009, "John","Doe", "john.doe@dsnalgos.com");
        sorter.employees[0] = emp1;
        Employee emp2 = new Employee(100000002, "Patrick","Dwight", "patrick.dwight@dsnalgos.com");
        sorter.employees[1] = emp2;
        Employee emp3 = new Employee(100000011, "Marlo","Thomas", "marlo.thomas@dsnalgos.com");
        sorter.employees[2] = emp3;
        Employee emp4 = new Employee(100000004, "Barbara","Weatherspoon", "barbara.weatherspoon@dsnalgos.com");
        sorter.employees[3] = emp4;
        sorter.sort();
        System.out.println(Arrays.deepToString(sorter.employees));
    }
}

class Employee {
    private int employeeNumber;
    private String firstName;
    private String lastName;
    private String emailId;

    public Employee(int employeeNumber, String firstName, String lastName, String emailId){
        this.employeeNumber = employeeNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    @Override
    public String toString() {
        return "EmployeeSorter{" +
                "employeeNumber=" + employeeNumber +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailId='" + emailId + '\'' +
                '}';
    }
}


