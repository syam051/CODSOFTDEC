import java.util.*;

class MarksSheet {
    char gradeCalc(int[] arr) {
        int n = arr.length;
        float result = 0;
        char grade = ' ';

        for (int i = 0; i < n; i++) {
            result += arr[i];
        }

        float avg = (result / n);
        System.out.println("Total Marks: " + result);
        System.out.println("Average Percentage: " + avg + "%");
		
        if (avg >= 85 && avg <= 100) {
            grade = 'A';
        } else if (avg >= 71 && avg < 85) {
            grade = 'B';
        } else if (avg >= 60 && avg < 71) {
            grade = 'C';
        } else {
            grade = 'F';
        }

        return grade;
    }

    public static void main(String[] args) {
        int[] arr = new int[7];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks for seven subjects out of 100 : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        MarksSheet m = new MarksSheet();
        char grade = m.gradeCalc(arr);
        System.out.println("Grade: " + grade);
    }
}
