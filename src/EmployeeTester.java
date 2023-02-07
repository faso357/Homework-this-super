public class EmployeeTester {
    public static void main(String[] args) {


                FullTime fullTimeEmployee = new FullTime("Magda", 50, 3000.0);
                System.out.println("Full Time Employee Details: ");
                fullTimeEmployee.displayFullTimeDetails();
                System.out.println();
                System.out.println("Part Time Employee Details: ");
                PartTime partTimeEmployee = new PartTime("Magdy", 26, 15.0, 40);
                partTimeEmployee.displayPartTimeDetails();


            }

        }

