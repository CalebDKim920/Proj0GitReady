// A program that prints out an a x a multiplication table

// test test test
// teesttt 234567 67
// test test 3

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        

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