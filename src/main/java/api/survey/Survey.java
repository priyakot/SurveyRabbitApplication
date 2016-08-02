package api.survey;

import api.response.Response;
import api.user.User;
/**
 * This is Survey Model containing the Survey Details
 * @author pkotwal
 *
 */
public class Survey{

    public String surveyId;
    public String title;
    public Integer status;
    public String dateCreated;
    public String dateModified;
    public Response responses[];
    public User authorId;
    public String surveyURL;

    public String getSurveyURL() {
		return surveyURL;
	}

	public void setSurveyURL(String surveyURL) {
		this.surveyURL = surveyURL;
	}

	public Survey(String surveyId, String title, Integer status, String dateCreated, String dateModified, Response[] responses, User authorId) {
        this.surveyId = surveyId;
        this.title = title;
        this.status = status;
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
        this.responses = responses;
        this.authorId = authorId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getDateModified() {
        return dateModified;
    }

    public void setDateModified(String dateModified) {
        this.dateModified = dateModified;
    }

    public Response[] getResponses() {
        return responses;
    }

    public void setResponses(Response[] responses) {
        this.responses = responses;
    }

    public User getAuthorId() {
        return authorId;
    }

    public void setAuthorId(User authorId) {
        this.authorId = authorId;
    }

    public String getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(String surveyId) {
        this.surveyId = surveyId;
    }

}