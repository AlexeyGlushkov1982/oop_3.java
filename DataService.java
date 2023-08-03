import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DataService {

    private List<User> users;


    public DataService(List<User> users) {
        this.users = users;
    }

    public DataService() {
        this.users = new ArrayList<>();
    }

    public List<User> getAll(){
        return users;
    }
    public Student create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {

        Student student = new Student(firstName, secondName, patronymic, dateOfBirth);
        this.users.add(student);
        return student;
    }



}