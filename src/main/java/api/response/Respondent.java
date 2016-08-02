package api.response;

import api.user.User;
/**
 * Respondent is a person who reponds to the survey
 * @author pkotwal
 *
 */
public class Respondent extends User {
	public Response[] responses;
	
	public Respondent(Integer uid, String name, String userType, Response[] responses) {
		super(uid, name, userType);
		this.responses = responses;
	}

}
