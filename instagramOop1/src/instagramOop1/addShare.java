package instagramOop1;
import java.sql.Date;

public class addShare {
	private int id;
	private String userName;
	private String image;
	private Date date;
	public addShare() {
		super();
	}
	public addShare(int id, String userName, String image, Date date) {
		super();
		this.id = id;
		this.userName = userName;
		this.image = image;
		this.date = date;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	

}
