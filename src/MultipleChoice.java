public class MultipleChoice extends Question{

    private String[] choices;
    private char correctAnswer;

    public MultipleChoice(String prompt, String[] choices, char correctAnswer) {
        super(prompt);
        this.choices = choices;
        this.correctAnswer = correctAnswer;
    }

    @Override
    public void displayChoices() {
        for (String choice : choices) {
            System.out.println(choice);
        }
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
