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

