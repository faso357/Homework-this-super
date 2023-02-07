public class Employee {
    String name;
     int age;
     Employee(String name,int age ) {
        this.name = name;
        this.age = age;}
    void displayEmployeeDetails() {
        System.out.println("Name is " + name);
        System.out.println("Age is " + age);
    }}
class FullTime extends Employee {
     double bonus;
     FullTime(String name,  int age , double bonus) {
        super(name,age );
        this.bonus = bonus;}

    void displayFullTimeDetails() {
        displayEmployeeDetails();
        System.out.println("Bonus is " + bonus);
    }}
class PartTime extends Employee {
    int hoursWorked;
     double hourlyRate;
    PartTime(String name,int age, double hourlyRate, int hoursWorked) {
        super(name, age);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    void displayPartTimeDetails(){
        displayEmployeeDetails();
        System.out.println("Hourly Rate is " + hourlyRate);
        System.out.println("Hours Worked is " + hoursWorked);
    }}
class Tester extends FullTime {
    String FixingBug;

    Tester(String name, int age, double bonus, String bugsFixed) {
        super(name,age, bonus);
        this.FixingBug = bugsFixed;}
         void displayTesterDetails(){
        displayFullTimeDetails();
        System.out.println("Bugs Fixed is " + FixingBug);
    }
}

