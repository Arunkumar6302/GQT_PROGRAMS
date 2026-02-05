package com.gqt.gqtcorejava.miniproject;

import java.util.Scanner;
import java.util.Random;

public class MajorProject {
    static final String GREEN = "\u001B[32m";
    static final String RED   = "\u001B[31m";
    static final String RESET = "\u001B[0m";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        String[] questions = {
            "1. Who invented Java?",
            "2. Which keyword is used to inherit a class?",
            "3. Which data type stores true/false?",
            "4. Which company developed Java?",
            "5. Which method is the entry point?",
            "6. Size of int in Java?",
            "7. Which loop executes at least once?",
            "8. Which keyword creates object?",
            "9. Which package contains Scanner?",
            "10. Java is a ______ language?"
        };

        String[][] options = {
            {"A. James Gosling", "B. Dennis Ritchie", "C. Guido van Rossum", "D. Bjarne Stroustrup"},
            {"A. implements", "B. super", "C. extends", "D. inherit"},
            {"A. int", "B. boolean", "C. char", "D. double"},
            {"A. Google", "B. Sun Microsystems", "C. Microsoft", "D. Oracle"},
            {"A. start()", "B. run()", "C. main()", "D. init()"},
            {"A. 2 bytes", "B. 4 bytes", "C. 8 bytes", "D. Depends"},
            {"A. for", "B. while", "C. do-while", "D. foreach"},
            {"A. class", "B. new", "C. create", "D. object"},
            {"A. java.util", "B. java.io", "C. java.lang", "D. java.sql"},
            {"A. Low-level", "B. Assembly", "C. High-level", "D. Machine"}
        };
        char[] answers = {'A','C','B','B','C','B','C','B','A','C'};
        int[] prize = {1000,2000,5000,10000,20000,40000,80000,160000,320000,1000000};
        boolean fiftyUsed = false;
        boolean audienceUsed = false;
        int totalAmount = 0;
        System.out.println("\n Welcome " + name + " to QUIZ APPLICATION ");
        for (int i = 0; i < questions.length; i++) {
            System.out.println("\n" + questions[i]);
            for (int j = 0; j < 4; j++) {
                System.out.println(options[i][j]);
            }
            if (i < 9) {
                System.out.println("\nLifelines Available:");
                if (!fiftyUsed) System.out.println("1. 50:50");
                if (!audienceUsed) System.out.println("2. Audience Poll");
            }

            System.out.print("Enter option (A/B/C/D) or Lifeline (1/2): ");
            String input = sc.next().toUpperCase();

            // ----------- 50:50 LIFELINE -----------
            if (input.equals("1")) {
                if (fiftyUsed || i == 9) {
                    System.out.println(RED + "50:50 not available" + RESET);
                    i--;
                    continue;
                }

                fiftyUsed = true;
                char correct = answers[i];
                char wrong;

                do {
                    wrong = (char) ('A' + rand.nextInt(4));
                } while (wrong == correct);

                System.out.println(" 50:50 Lifeline Used");
                System.out.println("Options:");
                System.out.println(correct);
                System.out.println(wrong);

                System.out.print("Enter your answer: ");
                char ans = sc.next().toUpperCase().charAt(0);

                if (ans == correct) {
                    totalAmount += prize[i];
                    System.out.println(GREEN + "Correct! Congratulations " + name + RESET);
                    System.out.println("You won :" + prize[i]);
                    System.out.println("Total amount won so far: " + totalAmount);
                    System.out.println("____________________________________________________________");
                } else {
                    System.out.println(RED + " Wrong Answer!" + RESET);
                    System.out.println("Correct answer: " + correct);
                    System.out.println("Total amount won: " + totalAmount);
                    break;
                }
                continue;
            }

            // ----------- AUDIENCE POLL -----------
            if (input.equals("2")) {
                if (audienceUsed || i == 9) {
                    System.out.println(RED + "Audience Poll not available" + RESET);
                    i--;
                    continue;
                }

                audienceUsed = true;
                System.out.println(" Audience Poll Result:");
                System.out.println(answers[i] + " : 70%");
                i--;
                continue;
            }

            // ----------- NORMAL ANSWER -----------
            char userAnswer = input.charAt(0);

            if (userAnswer == answers[i]) {
                totalAmount += prize[i];
                System.out.println(GREEN + "Correct! Congratulations " + name + RESET);
                System.out.println("You won :" + prize[i]);
                System.out.println("Total amount won so far: " + totalAmount);
                System.out.println("____________________________________________________________");
            } else {
                System.out.println(RED + "Wrong Answer!" + RESET);
                System.out.println("Correct answer: " + answers[i]);
                System.out.println("Total amount won: " + totalAmount);
                break;
            }
        }

        System.out.println("\nThank you for playing Quiz Application!");
        sc.close();
    }
}
