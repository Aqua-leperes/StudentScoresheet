import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // =========================
        // 1. INPUT SCHOOL DETAILS
        // =========================
        System.out.print("Enter School Name: ");
        String schoolName = input.nextLine();

        System.out.print("Enter Teacher Name: ");
        String teacherName = input.nextLine();

        System.out.print("Enter Grade: ");
        String grade = input.nextLine();

        System.out.print("Enter Year: ");
        int year = input.nextInt();
        input.nextLine(); // Clear buffer


        // =========================
        // 2. INPUT STUDENT RECORDS
        // =========================
        int n = 12;

        String[] name = new String[n];
        double[] eng = new double[n];
        double[] math = new double[n];
        double[] hist = new double[n];
        double[] geo = new double[n];
        double[] sci = new double[n];
        double[] prog = new double[n];
        double[] total = new double[n];
        char[] rank = new char[n];

        System.out.println("\nENTER DETAILS FOR " + n + " STUDENTS");

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Student " + (i + 1) + " ---");

            System.out.print("Name: ");
            name[i] = input.nextLine();

            System.out.print("English: ");
            eng[i] = input.nextDouble();

            System.out.print("Mathematics: ");
            math[i] = input.nextDouble();

            System.out.print("History: ");
            hist[i] = input.nextDouble();

            System.out.print("Geography: ");
            geo[i] = input.nextDouble();

            System.out.print("Science: ");
            sci[i] = input.nextDouble();

            System.out.print("Programming: ");
            prog[i] = input.nextDouble();

            input.nextLine(); // clear buffer

            // =========================
            // 3. CALCULATE TOTAL + GRADE
            // =========================
            total[i] = eng[i] + math[i] + hist[i] + geo[i] + sci[i] + prog[i];

            if (total[i] >= 540) rank[i] = 'A';
            else if (total[i] >= 480) rank[i] = 'B';
            else if (total[i] >= 420) rank[i] = 'C';
            else if (total[i] >= 360) rank[i] = 'D';
            else rank[i] = 'F';
        }


        // =========================
        // 4. CLASS STATISTICS
        // =========================
        double sumEng = 0, sumMath = 0, sumHist = 0, sumGeo = 0, sumSci = 0, sumProg = 0;
        int countA = 0, countB = 0, countC = 0, countD = 0, countF = 0;

        for (int i = 0; i < n; i++) {
            sumEng += eng[i];
            sumMath += math[i];
            sumHist += hist[i];
            sumGeo += geo[i];
            sumSci += sci[i];
            sumProg += prog[i];

            switch (rank[i]) {
                case 'A': countA++; break;
                case 'B': countB++; break;
                case 'C': countC++; break;
                case 'D': countD++; break;
                case 'F': countF++; break;
            }
        }


        // =========================
        // 5. PRINT REPORT
        // =========================
        System.out.println("\n==============================================================================================");

        // Center the header (width 80)
        System.out.printf("%80s\n", schoolName);
        System.out.printf("%80s\n", "Teacher: " + teacherName);
        System.out.printf("%80s\n", "Grade: " + grade);
        System.out.printf("%80s\n", "Year: " + year);

        System.out.println("==============================================================================================");

        // Column Headers (FULL NAMES)
        System.out.printf("%-20s %-12s %-12s %-12s %-12s %-12s %-15s %-10s %-5s\n",
                "Student Name", "English", "Mathematics", "History", "Geography",
                "Science", "Programming", "Total", "Rank");

        // Student Rows
        for (int i = 0; i < n; i++) {
            System.out.printf("%-20s %-12.2f %-12.2f %-12.2f %-12.2f %-12.2f %-15.2f %-10.2f %-5c\n",
                    name[i], eng[i], math[i], hist[i], geo[i], sci[i], prog[i], total[i], rank[i]);
        }

        System.out.println("----------------------------------------------------------------------------------------------");

        // Totals aligned
        System.out.printf("%-20s %-12.2f %-12.2f %-12.2f %-12.2f %-12.2f %-15.2f\n",
                "Totals:", sumEng, sumMath, sumHist, sumGeo, sumSci, sumProg);

        System.out.println("----------------------------------------------------------------------------------------------");

        // Averages aligned
        System.out.printf("%-20s %-12.2f %-12.2f %-12.2f %-12.2f %-12.2f %-15.2f\n",
                "Averages:", sumEng/n, sumMath/n, sumHist/n, sumGeo/n, sumSci/n, sumProg/n);

        System.out.println("==============================================================================================");

        System.out.println("Ranks Count  A's: " + countA + "  B's: " + countB +
                "  C's: " + countC + "  D's: " + countD + "  F's: " + countF);

    }
}
