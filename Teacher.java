class Teacher extends Person {
    private double salary;
    private String subject;

    public Teacher(String name, String dateOfBirth, double salary, String subject) {
        super(name, dateOfBirth);   // call parent constructor
        this.salary = salary;
        this.subject = subject;
    }

    @Override
    public void displayInfo() {
        System.out.println("--- Teacher Details ---");
        super.displayInfo();
        System.out.println("Subject: " + subject);
        System.out.println("Salary: $" + salary);
    }

    public void teach() {
        System.out.println(name + " is teaching " + subject + ".");
    }
}