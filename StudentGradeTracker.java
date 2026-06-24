import java.util.Scanner;

public class StudentGradeTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        int[] marks = new int[n];
        int total = 0;
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;

        // Input marks
        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks of Student " + (i + 1) + ": ");
            marks[i] = sc.nextInt();

            total += marks[i];

            if (marks[i] > highest) {
                highest = marks[i];
            }

            if (marks[i] < lowest) {
                lowest = marks[i];
            }
        }

        double average = (double) total / n;

        System.out.println("\n===== STUDENT GRADE REPORT =====");
        System.out.println("Total Marks : " + total);
        System.out.println("Average Marks : " + average);
        System.out.println("Highest Marks : " + highest);
        System.out.println("Lowest Marks : " + lowest);

        System.out.println("\nGrades:");

        for (int i = 0; i < n; i++) {
            char grade;

            if (marks[i] >= 90)
                grade = 'A';
            else if (marks[i] >= 80)
                grade = 'B';
            else if (marks[i] >= 70)
                grade = 'C';
            else if (marks[i] >= 60)
                grade = 'D';
            else
                grade = 'F';

            System.out.println("Student " + (i + 1) +
                    " -> Marks: " + marks[i] +
                    " Grade: " + grade);
        }

        sc.close();
    }
}