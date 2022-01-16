package instagramOop1;



public class User extends SignUp {
	private String[] images;
	private String bio;
	public User() {
		super();
	}
	public User(int id, String phoneNumber,String eMail, String name,String userName,String password,String[] images, String bio) {
		super(id,phoneNumber,eMail,name,userName,password);
		this.images = images;
		this.bio = bio;
	}
	public String[] getImages() {
		return images;
	}
	public void setImages(String[] images) {
		this.images = images;
	}
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	
	
	
}
