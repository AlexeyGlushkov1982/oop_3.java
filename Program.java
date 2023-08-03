import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;



public class Program {

    /**
     * — Создать класс Поток, содержащий в себе список УчебныхГрупп и реализующий интерфейс Iterable;
     * — Создать класс StreamComparator, реализующий сравнение количества групп, входящих в Поток;
     * — Создать класс ПотокСервис, добавив в него метод сортировки списка потоков, используя созданный StreamComparator;
     * — Модифицировать класс Контроллер, добавив в него созданный сервис;
     * — Модифицировать класс Контроллер, добавив в него метод, сортирующий список потоков, путём вызова созданного сервиса.
     *
     * Формат сдачи: ссылка на гитхаб проект
     * @param args
     */

    public static void main(String[] args) {
        DataService dataService = new DataService();
        StudentGroupService studentGroupService = new StudentGroupService();
        UserView userView = new UserView();
        UserController userController = new UserController(dataService, studentGroupService, userView);
        FlowOfGroups flowOfGroups2 = new FlowOfGroups();
        FlowOfGroups flowOfGroups1 = new FlowOfGroups();

        Student student1 =  userController.createStudent("AAA1", "BBB1", "CCC1", LocalDate.now());
        Student student2 = userController.createStudent("AAA2", "BBB2", "CCC2", LocalDate.now());
        Student student3 = userController.createStudent("AAA3", "BBB3", "CCC3", LocalDate.now());
        List<Student> students = new ArrayList<>(List.of(new Student[]{student1, student2}));
        List<Student> students2 = new ArrayList<>(List.of(new Student[]{student3}));
        StudentGroup flow = userController.createStudentGroup(new Teacher("AAA", "BBB", "CCC", LocalDate.now()),
                students);
        StudentGroup flow2 = userController.createStudentGroup(new Teacher("AAAT", "BBBT", "CCCT", LocalDate.now()),
                students2);
        flowOfGroups2.addFlowOfGroups(flow2);
        System.out.println("=== поток ===");
        System.out.println(flowOfGroups2);
        flowOfGroups2.addFlowOfGroups(flow);
        System.out.println("=== поток ===");
        System.out.println(flowOfGroups2);
        flowOfGroups1.addFlowOfGroups(flow2);
        userController.StreamComparator(flowOfGroups2, flowOfGroups2);
    }
}