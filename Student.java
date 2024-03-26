import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;

enum Major {COMPUTERSCIENCE, BUSINESS, PSYCHOLOGY, COMMUNICATIONS};

public class Student {
    String name = "Unknown Student";
    float GPA;
    boolean isVeteran;
    byte favoriteNumber;
    Major major; // Computer Science, Business, Psychology, Communications
    LocalDate dateOfBirth;

    public Student() {
        name = "Unknown Student";
        GPA = 1.0f;
        isVeteran = false;

    }

    public Student(String name) {
        this.name = name;
    }
    public Student(String name, LocalDate dob) {
        this.name = name;
        dateOfBirth = dob;
    }

    public String toString() {
        return name + " " + major;
    }
    public String toString(String additionalString) {
        return name + " " + major + " " + additionalString;


    }
    public int getAge() {
        return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }
}
