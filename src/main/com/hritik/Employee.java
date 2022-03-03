package main.com.hritik;

public class Employee {
    int id;
    String firstname;
    String lastname;
    int salary;

    public Employee(int id, String firstname, String lastname, int salary) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;
    }

    public int getId() {
        return this.id;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public String getLastname() {
        return this.lastname;
    }

    public String getName() {
        return this.firstname + " " + this.lastname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getAnnualSalary(){
        return this.salary*12;


    }
    public int raiseSalary(int percentage){
     return this.salary * (percentage/100);
    }



}
