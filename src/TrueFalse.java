
public class TrueFalse extends Question {

    private char correctAnswer;

    public TrueFalse(String prompt, char correctAnswer) {
        super(prompt);
        this.correctAnswer = correctAnswer;
    }

    @Override
    public void displayChoices() {

    }

    @Override
    public boolean evaluateAnswer() {
        char userInput = this.userAnswer.toCharArray()[0];
        if (this.correctAnswer == userInput) {
            this.point++;
            return true;
        }
        return false;
    }

}
