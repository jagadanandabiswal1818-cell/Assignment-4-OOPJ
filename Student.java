class Student extends Person {
    protected String studentId;

    public Student(String name, String dateOfBirth, String studentId) {
        super(name, dateOfBirth);
        this.studentId = studentId;
    }

    @Override
    public void displayInfo() {
        System.out.println("--- Student Details ---");
        super.displayInfo();
        System.out.println("Student ID: " + studentId);
    }

    public void study() {
        System.out.println(name + " is studying.");
    }
}