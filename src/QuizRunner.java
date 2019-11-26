import java.lang.reflect.Array;

public class QuizRunner {

    public static void main(String[] args) {

        Quiz quiz = new Quiz("For True/False questions, enter 't' or 'f'. For multiple choice questions enter the letter of your choice. For checkbox questions, enter the letters of your choices (ex. 'acd').");
        TrueFalse question1 = new TrueFalse("True or False: LaunchCode is preparing us for software development: ", 't');
        String[] choicesFor2 = {"a. JavaScript", "b. Java", "c. Python", "d. Fortran"};
        MultipleChoice question2 = new MultipleChoice("Multiple Choice: Which language are we currently learning? ", choicesFor2, 'b');
        String[] choicesFor3 = {"a. Python", "b. Java", "c. HTML", "d. C++", "e. JavaScript"};
        char[] answerFor3 = {'b', 'c', 'e'};
        Checkbox question3 = new Checkbox("Checkbox: Select which languages you will be knowledgeable in after completing LaunchCode: ", choicesFor3, answerFor3);

        quiz.addQuestion(question1);
        quiz.addQuestion(question2);
        quiz.addQuestion(question3);

        quiz.runQuiz();

        quiz.gradeQuiz();

    }

}
