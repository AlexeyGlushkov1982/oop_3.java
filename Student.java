import java.time.LocalDate;

public class Student extends User{
    public Student(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        super(firstName, secondName, patronymic, dateOfBirth);
    }

    @Override
    public String toString() {
        return "Student{" +
                " firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", patronymic='" + super.getPatronymic() + '\'' +
                ", dateOfBirth=" + super.getDateOfBirth() +
                '}';
    }
}