import java.util.Scanner;

public class GradeManager {

    private static final String[] UNITS = {"Java", "HCI", "Application Programming", "Network", "Cabling"};
    private static final int UNIT_COUNT = UNITS.length;
    private static final int PASS_MARK = 60;
    private static final int DISTINCTION_MARK = 90;
    private static final int EXCELLENT_MARK = 80;
    private static final int GOOD_MARK = 70;

    private static int[] getMarks() {
        Scanner scanner = new Scanner(System.in);
        int[] marks = new int[UNIT_COUNT];

        for (int i = 0; i < UNIT_COUNT; i++) {
            System.out.println("Enter the mark for " + UNITS[i] + ":");
            while (!scanner.hasNextInt()) {
                System.out.println("Please enter a valid integer.");
                scanner.next(); // Consume invalid input
            }
            marks[i] = scanner.nextInt();
        }

        // Do not close the Scanner here

        return marks;
    }

    private static double computeAverage(int[] marks) {
        int sum = 0;

        for (int mark : marks) {
            sum += mark;
        }

        return (double) sum / UNIT_COUNT;
    }

    private static String getGrade(double average) {
        if (average >= DISTINCTION_MARK) {
            return "A";
        } else if (average >= EXCELLENT_MARK) {
            return "B";
        } else if (average >= GOOD_MARK) {
            return "C";
        } else if (average >= PASS_MARK) {
            return "D";
        } else {
            return "F";
        }
    }

    private static void displayGrades(int[] marks, double average) {
        System.out.println("Unit\tMark\tGrade");

        for (int i = 0; i < UNIT_COUNT; i++) {
            System.out.print(UNITS[i] + "\t" + marks[i] + "\t");

            if (marks[i] >= DISTINCTION_MARK) {
                System.out.println("A");
            } else if (marks[i] >= EXCELLENT_MARK) {
                System.out.println("B");
            } else if (marks[i] >= GOOD_MARK) {
                System.out.println("C");
            } else if (marks[i] >= PASS_MARK) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }
        }

        System.out.println("Average\t" + average + "\t" + getGrade(average));
    }

    public static void main(String[] args) {
        int[] marks = getMarks();
        double average = computeAverage(marks);
        displayGrades(marks, average);
    }
}
