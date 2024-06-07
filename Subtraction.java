

package com.mycompany.subtraction;

import java.util.Scanner;

public class Subtraction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Generate two single-digit integers
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);

        // Ensure number1 >= number2
        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

        // Display the question
        System.out.println("What is " + number1 + " - " + number2 + "?");

        // Prompt the student for an answer
        System.out.print("Enter your answer: ");
        int answer = scanner.nextInt();

        // Check the answer
        if (answer == (number1 - number2)) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect. The correct answer is " + (number1 - number2) + ".");
        }

        scanner.close();
    }
}

