package instagramOop1;

public class SignUp {
	private int id;
	private String phoneNumber;
	private String eMail;
	private String name;
	private String userName;
	private String password;
	
	public SignUp() {
		super();
	}
	public SignUp(int id,String phoneNumber, String eMail, String name, String userName, String password) {
		super();
		this.id=id;
		this.phoneNumber = phoneNumber;
		this.eMail = eMail;
		this.name = name;
		this.userName = userName;
		this.password = password;
		
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	

}
