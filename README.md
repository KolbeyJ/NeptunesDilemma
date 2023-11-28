# 1. Neptune's Dilemma
Tarter sauce!  Everyone's favorite undersea monarch is losing his cockle shells!  He needs a reliable way to generate his beloved Tritonacci Sequence.  In this assignment you will create a program that generates whatever item in the sequence that he desires.  Your solution should involve the use of recursion.  You should provide a helper method with the following signature:
your final grade based on the assignment and exam grades you receive in the CMPS 280 course. You will create one class named `GradeSimulator` according to the following instructions:

1. One default constructor.
2. One `public void` method named `addQuizOrAssignment(double myGrade, double maxGrade)` that expects two `double` arguments. The first representing the grade you receive in the assignment and the other representing maximum grade possible for that assignment.
3. One `public void` method named `addExam(double myGrade, double maxGrade)` that expects two `double` arguments. The first representing the grade you receive in the exam and the other representing the maximum grade possible for that exam.
4. One `public double` method named `getFinalGrade()` that returns a `double` value that represents the current final grade in the course.
5. Negative input values should be ignored in the methods implementations and not change the final grade.

Note: there is no requirement regarding the attributes/datafields of your class. You are free to implement it as you wish. However, the methods *must* be implemented as described above.

Boilerplate code:

```java
public class GradeSimulator {
    /* Attributes/Data fields/Properties */
    // YOUR CODE HERE

    /* Constructor(s) */
    // YOUR CODE HERE

    /* Method(s) */
    // YOUR CODE HERE
}
```

After implementing the `GradeSimulator` class, you can create a tester program to test that your code does what it's supposed to do. It is not part of the grade, and you can be creative and test various different scenarios in your tester program.

Example tester program:

```java
public class Main {
    public static void main(String[] args) {
        GradeSimulator grader = new GradeSimulator();

        grader.addQuizOrAssignment(1, 1); // Attendance quizzes
        grader.addQuizOrAssignment(1, 1);
        grader.addQuizOrAssignment(1, 1);
        grader.addQuizOrAssignment(1, 1);
        grader.addQuizOrAssignment(1, 1);

        grader.addQuizOrAssignment(5, 5); // Hello assignment
        grader.addQuizOrAssignment(5, 5); // Average assignment
        grader.addQuizOrAssignment(5, 5); // Methods assignment

        grader.addExam(40, 40); // I nailed the first exam
        grader.addExam(30, 40); // I did well in the second exam
        grader.addExam(0, 40); // I bombed in the third exam
        
        System.out.println("My grade before the final: " + grader.getFinalGrade());

        grader.addExam(40, 40); // I nailed the final exam

        System.out.println("My grade after the final: " + grader.getFinalGrade());
    }
}
```

Hints:
1. This is the formula to calculate the final grade ($FG$):

    $FG=50\times QA + 50 \times E$

    Where:

    $QA=\frac{sumQuizOrAssignmentReceived}{sumQuizOrAssignmentMax}$

    $E=\frac{sumExamReceivedMinusLowest}{sumExamMaxExceptOne}$

   1. If no quiz/assignment is added, then the $QA$ component should be $1$.
   2. If no exam is added, then the $E$ component should be $1$.

2. Use this to compare with your own grade on Moodle!

## Assignment workflow

1. Accept the assignment when posted on Moodle
1. ***Clone*** the assignment repository
1. Solve the assignment
1. Submit (`commit` and `push`) the assignment
    1. Resubmit if necessary or contact the instructor for questions.
