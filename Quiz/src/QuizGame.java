import java.util.Scanner;

public class QuizGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define Java-related questions and answers:
        String[] questions = {
                "What is the default value of a boolean variable in Java?",
                "Which keyword is used to define a constant in Java?",
                "What is the output of the following code?\nint x = 5;\nSystem.out.println(x++);",
                "What is the purpose of the 'static' keyword in Java?",
                "Which Java keyword is used to exit a loop prematurely?"
        };

        String[] options = {
                "A) true\tB) false\tC) 0\tD) null",
                "A) constant\tB) static\tC) final\tD) define",
                "A) 5\tB) 6\tC) 4\tD) Compilation error",
                "A) To define a constant\tB) To access class variables\tC) To allocate memory\tD) To declare a method",
                "A) return\tB) continue\tC) exit\tD) break"
        };

        char[] answers = {'B', 'C', 'A', 'B', 'D'};
        int correctAnswer = 0;

        // Display and process each question
        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question " + (i + 1) + ": " + questions[i]);
            System.out.println(options[i]);
            System.out.print("Your answer (A/B/C/D): ");
            char userAnswer = Character.toUpperCase(scanner.next().charAt(0));

            // Compare user's answers with the correct answer
            if (userAnswer == answers[i]) {
                System.out.println("Your answer is Correct!");
                correctAnswer++;
            } else {
                System.out.println("Your answer is incorrect, the correct answer is " + answers[i] + ".");
            }
            System.out.println();
        }

        // Calculate and display the final score
        double score = (double) correctAnswer / questions.length * 100;
        System.out.println("Quiz completed!");
        System.out.println("Your final score: " + score + "%");

        scanner.close();
    }
}
