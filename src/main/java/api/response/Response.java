package api.response;
import java.util.ArrayList;
/**
 * This is a Response model containing response information
 * @author pkotwal
 *
 */
public class Response implements ResponseStatus{
    public Question question;
    public ArrayList<String> answers;
    int started, completed;
	String surveyId;

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public ArrayList<String> getAnswers() {
        return answers;
    }

    public void setAnswers(ArrayList<String> answers) {
        this.answers = answers;
    }

    public Response(Question question, ArrayList<String> answers) {

        this.question = question;
        this.answers = answers;
    }

    public Response(String surveyId, int started, int completed) {
    	this.surveyId = surveyId;
    	this.started = started;
    	this.completed = completed;
    }
    
	public String getSurveyId() {
		return this.surveyId;
	}

	public void setSurveyId(String surveyId) {
		this.surveyId = surveyId;
		
	}

	public int getStarted() {
		return this.started;
	}

	public void setStarted(int started) {
		 this.started = started;
		
	}

	public int getCompleted() {
		return this.completed;
	}

	public void setCompleted(int completed) {
		this.completed = completed;
		
	}
    
   
    /**
     POST : get_response_counts
     Details : Returns how many respondents have started and/or completed the survey for the given collector
     Endpoint : https://api.surveymonkey.net/v2/surveys/get_response_counts?api_key=your_api_key

     POST : get_responses
     Details : Takes a list of respondent ids and returns the responses that correlate to them. To be used with 'get_survey_details'
     Endpoint :http://localhost:8080/get_responses?key=your_key
     */

}


