import java.util.ArrayList;
import java.util.List;

public class StudentGroupService {

    private StudentGroup studentGroup;
    private FlowOfGroups flowOfGroups;

    public StudentGroup createStudentGroup(Teacher teacher, List<Student> students) {
        studentGroup = new StudentGroup(teacher, students);
        return studentGroup;
    }
//    public FlowOfGroups createFlowOfGroups(List<StudentGroup> students){
//        flowOfGroups = new FlowOfGroups(students);
//        return flowOfGroups;
//    }
    public FlowOfGroups addFlowOfGroups(List<StudentGroup> students){
        flowOfGroups.addFlowOfGroups((StudentGroup) students);
        return flowOfGroups;
    }

    public Student getStudentFromStudentGroup(String firstName, String secondName){
        List<Student> result = new ArrayList<>();
        for (Student student : studentGroup.getStudents()) {
            if(student.getFirstName().equalsIgnoreCase(firstName)
                    && student.getSecondName().equalsIgnoreCase(secondName)){
                result.add(student);
            }
        }
        if(result.size() == 0){
            System.out.printf("Студент с именем %s и фамилией %s не найден\n", firstName, secondName);
        }
        if(result.size() != 1){
            System.out.println("Найдено более одного студента с указанными именем и фамилией");
        }
        return result.get(0);
    }
}