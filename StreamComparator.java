public class StreamComparator{
    public static int compare(FlowOfGroups flowOfGroups1, FlowOfGroups flowOfGroups2){
        int count1 = (int)flowOfGroups1.getFlowofgroups().stream().count();
        int count2 = (int) flowOfGroups2.getFlowofgroups().stream().count();
        return Integer.compare(count1,count2);
    }
}