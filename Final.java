package SEE;

import CIE.StudentP;
import CIE.Internals;
import SEE.Externals;
import java.util.Scanner;

public class Final {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number of students:");
        int n = in.nextInt();

        StudentP[] students = new StudentP[n];
        Internals[] studentInternals = new Internals[n];
        Externals[] studentExternals = new Externals[n];

        int[] intern = new int[5];
        int[] extern = new int[5];

        in.nextLine(); // Consume the leftover newline character

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Student " + (i + 1));

            System.out.print("Name: ");
            String name = in.nextLine();

            System.out.print("USN: ");
            String usn = in.nextLine();

            System.out.print("Semester: ");
            int semester = in.nextInt();

            System.out.println("Enter Internal marks (5 subjects):");
            for (int j = 0; j < 5; j++) {
                intern[j] = in.nextInt();
            }

            System.out.println("Enter External marks (5 subjects):");
            for (int j = 0; j < 5; j++) {
                extern[j] = in.nextInt() / 2; // Convert to half marks
            }

            students[i] = new StudentP(usn, name, semester);
            studentInternals[i] = new Internals(intern);
            studentExternals[i] = new Externals(usn, name, semester, extern);

            in.nextLine(); // Consume the leftover newline character
        }

        System.out.println("\nDisplaying details:");

        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1) + " Details:");
            students[i].display();
            studentInternals[i].displayint();
            studentExternals[i].displayext();
            studentExternals[i].displayfinal(studentInternals[i]);
        }

        in.close();
    }
}


