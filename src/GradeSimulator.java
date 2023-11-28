public class GradeSimulator {
    private double totalAssignmentGrade;
    private double totalMaxAssignmentGrade;
    private double totalExamGrade;
    private double totalMaxExamGrade;

    public GradeSimulator() {
        totalAssignmentGrade = 0;
        totalMaxAssignmentGrade = 0;
        totalExamGrade = 0;
        totalMaxExamGrade = 0;
    }

    public void addQuizOrAssignment(double myGrade, double maxGrade) {
        if (myGrade >= 0 && maxGrade > 0) {
            totalAssignmentGrade += myGrade;
            totalMaxAssignmentGrade += maxGrade;
        }
    }

    public void addExam(double myGrade, double maxGrade) {
        if (myGrade >= 0 && maxGrade > 0) {
            totalExamGrade += myGrade;
            totalMaxExamGrade += maxGrade;
        }
    }

    public double getFinalGrade() {
        double assignmentPercentage = (totalMaxAssignmentGrade > 0) ? totalAssignmentGrade / totalMaxAssignmentGrade : 0;
        double examPercentage = (totalMaxExamGrade > 0) ? totalExamGrade / totalMaxExamGrade : 0;
        double finalGrade = (assignmentPercentage + examPercentage) / 2;
        finalGrade = Math.max(0, Math.min(1, finalGrade));
        return finalGrade * 100;
    }

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