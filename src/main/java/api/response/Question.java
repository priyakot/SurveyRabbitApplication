package api.response;
/**
 * This a Question model class comprising the question value and the questionType
 * questionType can also be an enum type: Type of questions are: 1. Single value 2. Multiple Choice questions 3. Open Ended questions
 * @author pkotwal
 *
 */
public class Question{
    public String question;
    public String questionType;


    public Question(String question, String questionType) {
        this.question = question;
        this.questionType = questionType;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getQuestionType() {
        return questionType;
    }

    public void setQuestionType(String questionType) {
        this.questionType = questionType;
    }
}
