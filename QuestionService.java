import java.util.*;

// QuestionService class manages the complete quiz.
public class QuestionService {

    // Scanner object to receive input from the user.
    Scanner sc = new Scanner(System.in);

    // Array to store Question objects.
    Question[] questions = new Question[5];

    // Array to store answers entered by the user.
    String[] selection = new String[5];

    // ======================================================
    // STATIC INPUT CONSTRUCTOR
    // ======================================================
    // This constructor contains predefined questions.
    // Uncomment this constructor if you want to use
    // hardcoded questions instead of entering them manually.

    /*
    public QuestionService(){

        // Initialize Question 1
        questions[0]=new Question(
                1,
                "Size of int",
                "2",
                "4",
                "8",
                "16",
                "4");

        // Initialize Question 2
        questions[1]=new Question(
                2,
                "Size of float",
                "2",
                "4",
                "8",
                "16",
                "4");

        // Initialize Question 3
        questions[2]=new Question(
                3,
                "Size of double",
                "2",
                "4",
                "8",
                "16",
                "8");

        // Initialize Question 4
        questions[3]=new Question(
                4,
                "Size of char",
                "2",
                "4",
                "8",
                "16",
                "2");

        // Initialize Question 5
        questions[4]=new Question(
                5,
                "Size of short",
                "2",
                "4",
                "8",
                "16",
                "2");
    }
    */

    // ======================================================
    // DYNAMIC INPUT CONSTRUCTOR
    // ======================================================
    // Allows the user to enter quiz questions at runtime.

    public QuestionService() {

        // Loop executes five times to create five questions.
        for (int i = 0; i < questions.length; i++) {

            System.out.println("Enter question id");
            int id = sc.nextInt();

            // Consume newline character left by nextInt().
            sc.nextLine();

            System.out.println("Enter the Question:");
            String question = sc.nextLine();

            System.out.println("Enter option 1:");
            String opt1 = sc.nextLine();

            System.out.println("Enter option 2:");
            String opt2 = sc.nextLine();

            System.out.println("Enter option 3:");
            String opt3 = sc.nextLine();

            System.out.println("Enter option 4:");
            String opt4 = sc.nextLine();

            System.out.println("Enter Correct Answer:");
            String answer = sc.nextLine();

            // Create Question object and store it in the array.
            questions[i] = new Question(id, question, opt1, opt2, opt3, opt4, answer);
        }
    }

    // ======================================================
    // Method to conduct the quiz.
    // ======================================================
    public void playQuiz() {

        int i = 0;

        // Enhanced for loop displays every question.
        for (Question q : questions) {

            System.out.println("Question:");

            // Display question ID and question text.
            System.out.println(q.getId() + ") " + q.getQuestion());

            // Display all four options.
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());

            System.out.println("Enter your Answer:");

            // Store the user's answer.
            selection[i++] = sc.nextLine();
        }

        // Display answers entered by the user.
        System.out.println("You entered answers:");

        for (String s : selection) {
            System.out.println(s);
        }
    }

    // ======================================================
    // Method to calculate and display score.
    // ======================================================
    public void printScore() {

        int score = 0;

        // Compare user answers with correct answers.
        for (int i = 0; i < questions.length; i++) {

            Question que = questions[i];

            String actualAnswer = que.getAnswer();

            String userAnswer = selection[i];

            // Increment score if answer is correct.
            if (actualAnswer.equals(userAnswer)) {
                score++;
            }
        }

        // Display final score.
        System.out.println("Your Score is : " + score);
    }
}