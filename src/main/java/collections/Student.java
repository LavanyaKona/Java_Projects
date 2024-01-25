package collections;

public class Student {

    private String firstName;
    private String lastName;
    private Double GPA;

    public Student(String firstName, String lastName, Double GPA) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.GPA = GPA;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Double getGPA() {
        return GPA;
    }
}
