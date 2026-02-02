// A program that prints out an a x a multiplication table

// test test test
// teesttt 234567 67
// test test 3

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size a for an a x a multiplication table: ");
        int a;
        if (sc.hasNextInt()) {
            a = sc.nextInt();
        } else {
            System.out.println("Invalid input. Please enter a positive integer.");
            sc.close();
            return;
        }

        if (a <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
            sc.close();
            return;
        }

        int max = a * a;
        int cellWidth = String.valueOf(max).length() + 1;
        int labelWidth = String.valueOf(a).length();

        // Print header
        System.out.printf("%" + (labelWidth + 2) + "s", "");
        for (int i = 1; i <= a; i++) {
            System.out.printf("%" + cellWidth + "d", i);
        }
        System.out.println();

        // Separator line
        for (int i = 0; i < labelWidth + 2 + cellWidth * a; i++) System.out.print("-");
        System.out.println();

        // Print rows
        for (int i = 1; i <= a; i++) {
            System.out.printf("%" + labelWidth + "d |", i);
            for (int j = 1; j <= a; j++) {
                System.out.printf("%" + cellWidth + "d", i * j);
            }
            System.out.println();
        }

        sc.close();
    }
}