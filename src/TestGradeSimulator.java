import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class TestGradeSimulator {

  @Test
  @DisplayName("Test constructor and default grade.")
  public void testNoValuesConstructor()
  {
    GradeSimulator grader = new GradeSimulator();
    assertEquals(100., grader.getFinalGrade());
  }
  @Test
  @DisplayName("Test input quiz and assignment only. Lack of exams should not penalize final grade.")
  public void testNoExams()
  {
    GradeSimulator grader = new GradeSimulator();
    grader.addQuizOrAssignment(0.5, 1);
    assertEquals(75., grader.getFinalGrade());
  }
  @Test
  @DisplayName("Test assignments with negative input should not affect the grade as it is invalid.")
  public void testNegativeAssignment()
  {
    GradeSimulator grader = new GradeSimulator();
    grader.addQuizOrAssignment(0.5, 1);
    grader.addQuizOrAssignment(-0.5, 1);
    grader.addQuizOrAssignment(0.5, -1);
    grader.addQuizOrAssignment(-0.5, -1);
    assertEquals(75., grader.getFinalGrade());
  }
  @Test
  @DisplayName("Test exams only. Lack of assignments should not penalize final grade.")
  public void testOnlyExams()
  {
    GradeSimulator grader = new GradeSimulator();
    grader.addExam(40, 40);
    grader.addExam(40, 40);
    grader.addExam(40, 40);
    assertEquals(100., grader.getFinalGrade());
    grader.addExam(0, 40);
    assertEquals(100., grader.getFinalGrade());
  }
  @Test
  @DisplayName("Test negative exams. Should be ignored and grade unchanged.")
  public void testNegativeExams()
  {
    GradeSimulator grader = new GradeSimulator();
    grader.addExam(40, 40);
    grader.addExam(40, 40);
    grader.addExam(40, 40);
    assertEquals(100., grader.getFinalGrade());
    grader.addExam(0, 40);
    assertEquals(100., grader.getFinalGrade());
  }

  @Test
  @DisplayName("Test lowest drop.")
  public void testLowestDrop()
  {
    GradeSimulator grader = new GradeSimulator();
    grader.addQuizOrAssignment(1, 1);
    grader.addExam(40, 40);
    grader.addExam(20, 40);
    grader.addExam(0, 40);
    grader.addExam(0, 40);
    assertEquals(75., grader.getFinalGrade());
  }

  @Test
  @DisplayName("Comprehensive test.")
  public void testComprehensive()
  {
    GradeSimulator grader = new GradeSimulator();
    grader.addQuizOrAssignment(0.5, 1);
    grader.addExam(40, 40);
    grader.addExam(20, 40);
    grader.addExam(0, 40);
    grader.addExam(0, 40);
    assertEquals(50., grader.getFinalGrade());
  }
}