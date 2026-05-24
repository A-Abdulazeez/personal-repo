import java.util.*;

public class StudentManagementSystem {

    public static String studentName(String studentName) {
        return studentName;
    }

    public static char studentGrading(int studentGrade) {

        char grade = ' ';

        if (studentGrade >= 70) {
            grade = 'A';
        }
        else if (studentGrade >= 60) {
            grade = 'B';
        }
        else if (studentGrade >= 50) {
            grade = 'C';
        }
        else if (studentGrade >= 45) {
            grade = 'D';
        }
        else if (studentGrade >= 40) {
            grade = 'E';
        }
        else {
            grade = 'F';
        }

        return grade;
    }

    public static int[] studentScore(int... studentScores) {
        for (int index = 0; index < studentScores.length; index++) {

            if (studentScores[index] < 0 ||
                studentScores[index] > 100) {

                throw new IllegalArgumentException(
                        "Score must be between 0 and 100"
                );
            }
        }

        return studentScores;
    }

    public static int studentTotalScore(int[] scores) {

        int total = 0;

        for (int index = 0; index < scores.length; index++) {
            total += scores[index];
        }

        return total;
    }

    public static int studentAverageScore(int[] scores) {

        int total = studentTotalScore(scores);

        return total / scores.length;
    }

    public static String displayFinalResult(
            String name,
            int[] scores) {

        name = studentName(name);

        int total = studentTotalScore(scores);

        int averageScore = studentAverageScore(scores);

        char grade =
                studentGrading(averageScore);

        return String.format(
                "Student name: %s%n" +
                "Total Score: %d%n" +
                "Average Score: %d%n" +
                "Grade: %c",
                name,
                total,
                averageScore,
                grade
        );
    }

    public static void main(String[] args) {

        String name = "Azeez";
        int[] scores = studentScore(
                78, 40, 90, 54, 83,
                88, 70, 61, 95, 84,
                56, 72
        );

        System.out.println(
                displayFinalResult(
                        name,
                        scores
                )
        );
    }
}