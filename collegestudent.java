
class CollegeStudent extends Student {
    private String collegeName;
    private String year;   // first / second / third / fourth

    public CollegeStudent(String name, String dateOfBirth, String studentId,
                          String collegeName, String year) {
        super(name, dateOfBirth, studentId);
        this.collegeName = collegeName;
        this.year = year;
    }

    @Override
    public void displayInfo() {
        System.out.println("--- College Student Details ---");
        super.displayInfo();
        System.out.println("College Name: " + collegeName);
        System.out.println("Year of Study: " + year);
    }

    public void attendLecture() {
        System.out.println(name + " (Year: " + year + ") is attending a lecture at " + collegeName + ".");
    }
}