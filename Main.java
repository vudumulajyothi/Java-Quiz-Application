// Main class of the Quiz Application
class Main {

    // Program execution starts from the main method
    public static void main(String[] args) {

        // Creating an object of QuestionService
        // Constructor automatically loads all quiz questions
        QuestionService service = new QuestionService();

        // Starts the quiz and accepts user answers
        service.playQuiz();

        // Calculates and displays the final score
        service.printScore();
    }
}