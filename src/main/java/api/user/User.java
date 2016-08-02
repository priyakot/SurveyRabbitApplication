package api.user;
/**
 * This is a User Model class with the fields 
 * 	uid: primary key
 *  uname
 *  userType
 * @author pkotwal
 *
 */
public class User{
	Integer uid;
	String name;
	String userType;
	
	public User(Integer uid, String name, String userType) {
		super();
		this.uid = uid;
		this.name = name;
		this.userType = userType;
	}

	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getUserName() {
		return name;
	}
	public void setUserName(String userName) {
		this.name = name;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
}