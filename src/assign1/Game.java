package assign1;

import java.util.Random;
import java.util.Scanner;

class Game {
    private Question[] questions;
    private int score;
    private final int NUM_QUESTIONS_PER_ROUND = 5;

    public Game() {
        initializeQuestions();
        score = 0;
    }

    private void initializeQuestions() {
        questions = new Question[]{
                new Question("What is the capital of France?", new String[]{"Paris", "London", "Berlin"}, 0),
                new Question("What is the chemical symbol for gold?", new String[]{"Au", "Ag", "Fe"}, 0),
                new Question("Which sport is played with a shuttlecock?", new String[]{"Tennis", "Badminton", "Soccer"}, 1),
                new Question("What is the largest planet in our solar system?", new String[]{"Earth", "Jupiter", "Mars"}, 1),
                new Question("Who wrote the play 'Romeo and Juliet'?", new String[]{"William Shakespeare", "Charles Dickens", "Jane Austen"}, 0),
                new Question("What is the atomic number of carbon?", new String[]{"6", "12", "8"}, 0),
                new Question("Which country won the FIFA World Cup in 2018?", new String[]{"Brazil", "Germany", "France"}, 2)
        };
    }

    public void startGame() {
        System.out.println("Welcome to the Quiz Game!");
        for (int i = 0; i < NUM_QUESTIONS_PER_ROUND; i++) {
            Question currentQuestion = getRandomQuestion();
            System.out.println("Question " + (i + 1) + ":");
            currentQuestion.displayQuestion();
            int userChoice = getUserChoice();
            if (currentQuestion.isCorrect(userChoice)) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer was Option " + currentQuestion.getCorrectOption() + "\n");
            }
        }
        System.out.println("Quiz complete! Your score: " + score + "/" + NUM_QUESTIONS_PER_ROUND);
    }

    private Question getRandomQuestion() {
        Random random = new Random();
        int randomIndex = random.nextInt(questions.length);
        Question selectedQuestion = questions[randomIndex];
        // Remove the selected question to avoid duplicates
        questions = removeQuestionFromArray(questions, randomIndex);
        return selectedQuestion;
    }

    private Question[] removeQuestionFromArray(Question[] array, int indexToRemove) {
        Question[] newArray = new Question[array.length - 1];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i != indexToRemove) {
                newArray[j] = array[i];
                j++;
            }
        }
        return newArray;
    }

    private int getUserChoice() {
        Scanner scanner = new Scanner(System.in);
        int userChoice = -1;
        while (userChoice < 1 || userChoice > 3) {
            System.out.print("Enter your choice (1/2/3): ");
            if (scanner.hasNextInt()) {
                userChoice = scanner.nextInt();
            } else {
                scanner.next();
            }
        }
        return userChoice - 1; // Adjust for array index
    }
}
