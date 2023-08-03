import java.util.List;

public class UserView {

    public void printOnConsole(List<User> list){
        System.out.println("Актуальный список всех студентов:");
        System.out.println("================================");
        for (User user: list) {
            System.out.println(user);
        }
        System.out.println("================================\n");
    }

    public void printOnConsole(StudentGroup group){
        System.out.println("=== Группа ===");
        System.out.println(group);
    }
    public void printOnConsole(FlowOfGroups flowOfGroups){
        System.out.println("=== Поток ===");
        System.out.println(flowOfGroups);
    }
    public void printOnConsole(int compare){
        System.out.println("===Сравнение потоков===");
        if (compare==1) System.out.println("Первый поток больше второго потока");
        if (compare == -1) System.out.println("Второй поток больше первого потока");
        if (compare == 0) System.out.println("Потоки равны");
    }

}