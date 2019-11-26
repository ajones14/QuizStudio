
import java.util.ArrayList;

public class Quiz {

    private ArrayList<Question> questions = new ArrayList<>();
    private String instructions;

    public Quiz(String instructions) {
        this.instructions = instructions;
    }

    public void addQuestion(Question question) {
        this.questions.add(question);
    }

    public void runQuiz() {
        System.out.println(this.instructions);
        for (Question question : questions) {
            question.displayPrompt();
            question.displayChoices();
            question.collectAnswer();
            question.evaluateAnswer();
        }
    }

    public void gradeQuiz() {
        double points = Question.getPoint();
        double percentGrade = points / this.questions.size();
        System.out.println("Your Grade: " + points);
    }

}
