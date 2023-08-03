import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FlowOfGroups implements Iterable<StudentGroup> {
    private List<StudentGroup> flowofgroups;

    public FlowOfGroups() {
        flowofgroups = new ArrayList<>();
    }
    public void addFlowOfGroups(StudentGroup studentGroup){
        flowofgroups.add(studentGroup);
    }

    public List<StudentGroup> getFlowofgroups() {
        return flowofgroups;
    }

    @Override
    public String toString() {
        return "FlowOfGroups{" +
                "flowofgroups=" + flowofgroups +
                '}';
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return flowofgroups.iterator();
    }
}