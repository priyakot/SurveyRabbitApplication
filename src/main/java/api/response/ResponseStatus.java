package api.response;
/**
 * This interface contains additional response information
 * @author pkotwal
 *
 */
public  interface ResponseStatus {
	
	public String getSurveyId();

	public void setSurveyId(String surveyId);

	public int getStarted();

	public void setStarted(int started);

	public int getCompleted();

	public void setCompleted(int completed);

	
	
    
}
