import java.util.Arrays;

public class Checkbox extends Question{

    private String[] choices;
    private char[] correctAnswer;

    public Checkbox(String prompt, String[] choices, char[] correctAnswer) {
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
        char[] userInput = this.userAnswer.toCharArray();
        Arrays.sort(userInput);
        Arrays.sort(correctAnswer);
        if (Arrays.equals(correctAnswer, userInput)) {
            this.point++;
            return true;
        }
        return false;
    }

}
