public class Main {
    public static void main(String[] args) {
        GradeSimulator grader = new GradeSimulator();

        grader.addQuizOrAssignment(1, 1); // Attendance quizzes
        grader.addQuizOrAssignment(1, 1);
        grader.addQuizOrAssignment(1, 1);
        grader.addQuizOrAssignment(1, 1);
        grader.addQuizOrAssignment(1, 1);

        grader.addQuizOrAssignment(5, 5); // Hello assignment
        grader.addQuizOrAssignment(5, 5); // Second assignment
        grader.addQuizOrAssignment(10, 10); // Third assignment

        grader.addExam(40, 40); // I nailed the first exam
        grader.addExam(30, 40); // I did well in the second exam
        grader.addExam(0, 40); // I bombed in the third exam

        System.out.println("My grade before the final: " + grader.getFinalGrade());

        grader.addExam(40, 40); // I nailed the final exam

        System.out.println("My grade after the final: " + grader.getFinalGrade());
    }
}