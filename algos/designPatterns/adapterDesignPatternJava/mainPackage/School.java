package adapterDesignPatternJava.mainPackage;

public class School {
    public static void main(String[] args) {

        Pen pen = new PenAdapter();
        AssignmentWork assignmentWork = new AssignmentWork();
        assignmentWork.setPen(pen);
        assignmentWork.writeAssignment("I'm tired to write an assignment");
    }
}
