import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.print("Enter Number Of Subjects: ");
        int noOfSubjects = sc.nextInt();

        int[] marks = new int[noOfSubjects];
        int totalMarks = 0;
        for (int i = 0; i < noOfSubjects ; i++) {
            System.out.print("Enter marks obtained in subject " + (i+1) + ": ");
            marks[i] = sc.nextInt();
            totalMarks += marks[i];
        }

        double averagePercentageObtained = ((double) totalMarks / noOfSubjects);

        String gradeObtained;
        if (averagePercentageObtained == 100) {
            gradeObtained = "O";
        } else if (averagePercentageObtained >= 90) {
            gradeObtained = "A+";
        } else if (averagePercentageObtained >= 80) {
            gradeObtained = "A";
        } else if (averagePercentageObtained >= 70) {
            gradeObtained = "B+";
        } else if (averagePercentageObtained >= 60){
            gradeObtained = "B";
        } else if (averagePercentageObtained >= 50) {
            gradeObtained = "C";
        } else if (averagePercentageObtained >= 40) {
            gradeObtained = "D";
        } else {
            gradeObtained = "U";
        }

        System.out.println("Total Marks: " + totalMarks + "/" + noOfSubjects * 100);
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentageObtained);
        System.out.println("Grade: " + gradeObtained);

    }
}
