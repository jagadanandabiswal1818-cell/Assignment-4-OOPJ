public class TestEmployee {
    public static void main(String[] args) {
        // Testing parameterized constructor
        Employee emp = new Employee("Alice Smith", 85000.50, 2018, "AB123456C");

        System.out.println("--- Employee Details (Constructor Initialized) ---");
        System.out.println("Name: " + emp.getName());
        System.out.println("Annual Salary: $" + emp.getAnnualSalary());
        System.out.println("Start Year: " + emp.getStartYear());
        System.out.println("National Insurance Number: " + emp.getNationalInsuranceNumber());

        // Testing setter methods
        emp.setName("Alice Johnson");
        emp.setAnnualSalary(92000.00);
        emp.setStartYear(2019);
        emp.setNationalInsuranceNumber("XY987654Z");

        System.out.println("\n--- Employee Details (After Using Setters) ---");
        System.out.println("Updated Name: " + emp.getName());
        System.out.println("Updated Salary: $" + emp.getAnnualSalary());
        System.out.println("Updated Start Year: " + emp.getStartYear());
        System.out.println("Updated NI Number: " + emp.getNationalInsuranceNumber());
    }
}