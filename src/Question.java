import java.util.Scanner;

public abstract class Question {

    private String prompt;
    protected String userAnswer;
    protected static int point;

    public Question(String prompt) {
        this.prompt = prompt;
        this.point = 1;
    }

    public void displayPrompt() {
        System.out.println(getPrompt());
    }

    public abstract void displayChoices();

    public void collectAnswer() {
        Scanner input = new Scanner(System.in);
        this.userAnswer = input.nextLine();
        this.userAnswer = this.userAnswer.toLowerCase();
        input.close();
    }

    public String getPrompt() {
        return prompt;
    }

    public abstract boolean evaluateAnswer();

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public String getUserAnswer() {
        return userAnswer;
    }

    public void setUserAnswer(String userAnswer) {
        this.userAnswer = userAnswer;
    }

    public static int getPoint() {
        return point;
    }
}
