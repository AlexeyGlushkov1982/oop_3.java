import java.time.LocalDate;
import java.util.List;

public class UserController {

    private final DataService dataService;
    private final StudentGroupService studentGroupService;
    private final UserView userView;

    public UserController(DataService dataService, StudentGroupService studentGroupService, UserView userView) {
        this.dataService = dataService;
        this.studentGroupService = studentGroupService;
        this.userView = userView;
    }

    public Student createStudent(String firstName, String secondName, String patronymic, LocalDate dateOfBirth){
        Student student = dataService.create(firstName, secondName, patronymic, dateOfBirth);
        List<User> userList = dataService.getAll();
        userView.printOnConsole(userList);
        return student;
    }

    public StudentGroup createStudentGroup(Teacher teacher, List<Student> students){
        StudentGroup studentGroup = studentGroupService.createStudentGroup(teacher, students);
        userView.printOnConsole(studentGroup);
        return studentGroup;
    }
//    public FlowOfGroups createFlowOfGroups(List<StudentGroup> students){
//        FlowOfGroups flowOfGroups = studentGroupService.createFlowOfGroups(students);
//        userView.printOnConsole(flowOfGroups);
//        return flowOfGroups;
//    }
    public void addFlowOfGroups(List<StudentGroup> students){
        userView.printOnConsole((StudentGroup) students);

    }
    public void StreamComparator(FlowOfGroups flowOfGroups1, FlowOfGroups flowOfGroups2){
        int compare = StreamComparator.compare(flowOfGroups1, flowOfGroups2);
        userView.printOnConsole(compare);

    }

}