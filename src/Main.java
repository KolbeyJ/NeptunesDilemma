public class Main {
    public static void main(String[] args) {
        GradeSimulator gradeSimulator = new GradeSimulator();

        gradeSimulator.addQuizOrAssignment(90.0, 100.0);
        gradeSimulator.addQuizOrAssignment(80.0, 100.0);

        gradeSimulator.addExam(75.0, 100.0);
        gradeSimulator.addExam(85.0, 100.0);

        double finalGrade = gradeSimulator.getFinalGrade();
        System.out.println("Final Grade: " + finalGrade);
    }
}
