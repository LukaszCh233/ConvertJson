import java.util.List;

public class Questions {
    public String question1;
    public List<String> answer1;
    public String correctAnswer1;

    public Questions() {

    }

    public String getQuestion1() {
        return question1;
    }

    public void setQuestion1(String question1) {
        this.question1 = question1;
    }

    public List<String> getAnswer1() {
        return answer1;
    }

    public void setAnswer1(List<String> answer1) {
        this.answer1 = answer1;
    }

    public String getCorrectAnswer1() {
        return correctAnswer1;
    }

    public Questions(String question1, List<String> answer1, String correctAnswer1) {
        this.question1 = question1;
        this.answer1 = answer1;
        this.correctAnswer1 = correctAnswer1;
    }

    public void setCorrectAnswer1(String correctAnswer1) {
        this.correctAnswer1 = correctAnswer1;

    }

    @Override
    public String toString() {
        return "Questions{" +
                "question1='" + question1 + '\'' +
                ", answer1=" + answer1 +
                ", correctAnswer1='" + correctAnswer1 + '\'' +
                '}';
    }


}
