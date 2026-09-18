
class Person {
    protected String name;
    protected String dateOfBirth;

    public Person(String name, String dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Date of Birth: " + dateOfBirth);
    }

    public String getName() { return name; }
    public String getDateOfBirth() { return dateOfBirth; }
}