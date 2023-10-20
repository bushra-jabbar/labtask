package assign1;

class Question {
    private final String question;
    private final String[] options;
    private final int correctOption;

    public Question(String question, String[] options, int correctOption) {
        this.question = question;
        this.options = options;
        this.correctOption = correctOption;
    }

    public boolean isCorrect(int userChoice) {
        return userChoice == correctOption;
    }

    public void displayQuestion() {
        System.out.println(question);
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
    }

    public int getCorrectOption() {
        return correctOption + 1;
        // Adjust for display (start from 1)
    }
}
