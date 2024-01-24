import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of subjects:");
        int numSub = scanner.nextInt();

        // Input marks for each subject
        int totalMarks = 0;

        for (int i = 1; i <= numSub; i++) {
            System.out.print("Enter marks for Subject " + i + " (out of 100): ");
            int subMarks = scanner.nextInt();

            // Ensure marks are within valid range (0 to 100)
            subMarks = Math.max(0, Math.min(subMarks, 100));

            totalMarks += subMarks;
        }

        // Calculate average percentage
        double averagePercentage = (double) totalMarks / numSub;

        // Assign grades based on average percentage
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Display results
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}