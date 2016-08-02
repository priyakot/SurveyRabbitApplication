package api.controller;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import api.response.Question;
import api.response.Respondent;
import api.response.Response;
import api.survey.Survey;
import api.user.User;

import java.util.ArrayList;
/**
 * This is the SurveyController class which contains the REST apis 
 * required for managing the application
 * @author pkotwal
 *
 */
@RestController
public class SurveyController {

    private final AtomicLong counter = new AtomicLong();
    public static Response responses[] = new Response[4];
    User authorId = null;
    
    /**
     *  POST : create_survey
     	Details : Create a survey
     * @param title
     * @return
     */
    
    @RequestMapping("/api/createsurvey")
    public Survey createSurvey(@RequestParam(value="survey_title", defaultValue="Title") String title) {
        initialize();
        return new Survey(String.valueOf(counter.incrementAndGet()),
                "This is a Test Survey",
                0,
                "2016/08/01:20:00:00",
                "2016/08/01:20:00:00",
                responses,
                authorId);
    }
    
    /**
     * POST : get_survey_details
     * Details : Retrieve a given survey's metadata.
     * @param title
     * @return
     */
    @RequestMapping("/api/get_survey_details")
    public Survey getSurveyDetails(@RequestParam(value="survey_id", defaultValue="survey_id") String survey_id) {
    	getResponses();
        return new Survey(String.valueOf(1234),
                "This is a Test Survey",
                0,
                "2016/08/01:20:00:00",
                "2016/08/01:22:00:00",
                responses,
                authorId);
    }
    
    /**
     * POST : get_survey_list
	   Details : Retrieves a paged list of surveys in a user"s account.
     * @param title
     * @return
     */
    @RequestMapping("/api/get_survey_list")
    public Survey[] getSurveyList(@RequestParam(value="uid", defaultValue="1234") String uid) {
    	Survey[] surveys = getSurveyLists();
        return surveys;
    }
    
    public Survey[] getSurveyLists(){
    	Survey survey1 = new Survey(String.valueOf(1234),
                "Test Survey1",
                0,
                "2016/08/01:20:00:00",
                "2016/08/01:22:00:00",
                responses,
                authorId);
    	Survey survey2 = new Survey(String.valueOf(1234),
                "Test Survey1",
                0,
                "2016/08/01:20:00:00",
                "2016/08/01:22:00:00",
                responses,
                authorId);
    	Survey[] surveys = {survey1, survey2};
    	return surveys;
    }

    /**
     *  POST : getResponseCounts
     	Details : Gets the number of responses started/completed
     * @param uid
     * @return
     */
    
    @RequestMapping("/api/get_response_counts")
    public Response[] getResponseCounts(@RequestParam(value="uid", defaultValue="uid") String uid) {
    	Response response1 = new Response("1231",4,4);
    	Response response2 = new Response("1230",2,0);
    	Response responses[] = {response1, response2};
        return responses;
    }
    
    /**
     *POST : get_responses
	  Details :Takes a list of respondent ids and returns the responses that correlate to them. To be used with 'get_survey_details'
     * @param respondentId
     * @return
     */
    
    @RequestMapping("/api/get_responses")
    public Respondent  getResponses(@RequestParam(value="respondentId", defaultValue="respondentId") String respondentId) {
    	return new Respondent(231, "testUser", "admin", responses);
    }
    
    /**
     *  POST : edit_survey
     	Details : Edit a survey
     * @param title
     * @return
     */
    
    @RequestMapping("/api/editsurvey")
    public Survey editSurvey(@RequestParam(value="survey_title", defaultValue="Title") String title) {
        initialize();
        return new Survey(String.valueOf(counter.incrementAndGet()),
                "This is a Test Survey",
                0,
                "2016/08/01:20:00:00",
                "2016/08/01:20:00:00",
                responses,
                authorId);
    }

    /**
     *  POST : save_survey
     	Details : Save a survey.
     * @param title
     * @return
     */
    
    @RequestMapping("/api/savesurvey")
    public Survey saveSurvey(@RequestParam(value="survey_title", defaultValue="Title") String title) {
        initialize();
        return new Survey(String.valueOf(counter.incrementAndGet()),
                "This is a Test Survey",
                0,
                "2016/08/01:20:00:00",
                "2016/08/01:20:00:00",
                responses,
                authorId);
    }
    
    /**
     *  POST : delete_survey
     	Details : Delete a survey.
     * @param title
     * @return
     */
    
    @RequestMapping("/api/deletesurvey")
    public Survey deleteSurvey(@RequestParam(value="survey_title", defaultValue="Title") String title) {
        initialize();
        return new Survey(String.valueOf(counter.incrementAndGet()),
                "This is a Test Survey",
                0,
                "2016/08/01:20:00:00",
                "2016/08/01:20:00:00",
                responses,
                authorId);
    }

    /**
     * Dummy initialization method
     */
    public void initialize(){
        Question question1  = new Question("How satisfied are you with this application? ", "Single");
        Question question2  = new Question("What would you use to describe the application? ", "Multiple");
        Question question4  = new Question("How likely are you to recommend application? ", "Single");
        Question question3  = new Question("Do you have any suggestions for improving this application? ", "OpenEnded");

        ArrayList<String> answers1 = new ArrayList<String>();
        answers1.add("Extremely satisfied");
        answers1.add("Very satisfied");
        answers1.add("Somewhat satisfied");

        ArrayList<String> answers2 = new ArrayList<String>();
        answers2.add("Excellent");
        answers2.add("Easy to use");
        answers2.add("None of the above");
        ArrayList<String> answers3 = new ArrayList<String>();
        answers3.add("1");
        answers3.add("2");
        answers3.add("3");
        answers3.add("4");
        answers3.add("5");

        ArrayList<String> answers4 = new ArrayList<String>();
        answers4.add("Limited to 200 chars ");

        Response response1 = new Response(question1, answers1);
        Response response2 = new Response(question2, answers2);
        Response response3 = new Response(question3, answers3);
        Response response4 = new Response(question4, answers4);

        responses[0] =response1;
        responses[1] =response2;
        responses[2] =response3;
        responses[3] =response4;

        authorId = new User(1234,"test", "author");

    }
    
    /**
     * Dummy responses method
     */
    public void getResponses(){
        Question question1  = new Question("How satisfied are you with this application? ", "Single");
        Question question2  = new Question("What would you use to describe the application? ", "Multiple");
        Question question4  = new Question("How likely are you to recommend application? ", "Single");
        Question question3  = new Question("Do you have any suggestions for improving this application? ", "OpenEnded");

        ArrayList<String> answers1 = new ArrayList<String>();
        answers1.add("Extremely satisfied");

        ArrayList<String> answers2 = new ArrayList<String>();
        answers2.add("Excellent");

        ArrayList<String> answers3 = new ArrayList<String>();
        answers3.add("5");

        ArrayList<String> answers4 = new ArrayList<String>();
        answers4.add("Perfect survey!");

        Response response1 = new Response(question1, answers1);
        Response response2 = new Response(question2, answers2);
        Response response3 = new Response(question3, answers3);
        Response response4 = new Response(question4, answers4);

        responses[0] =response1;
        responses[1] =response2;
        responses[2] =response3;
        responses[3] =response4;

        authorId = new User(1234,"test1", "author");

    }
       
}
