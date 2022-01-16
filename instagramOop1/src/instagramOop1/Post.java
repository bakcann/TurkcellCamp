package instagramOop1;
import java.sql.Date;
public class Post extends addShare {
	private String save;
	private String send;
	private String[] like;
	private String[] comment;
	public Post() {
		super();
	}
	public Post(int id, String userName,String image, Date date,String save, String send, String[] like, String[] comment) {
		super(id,userName,image,date);
		this.save = save;
		this.send = send;
		this.like = like;
		this.comment = comment;
	}
	public String getSave() {
		return save;
	}
	public void setSave(String save) {
		this.save = save;
	}
	public String getSend() {
		return send;
	}
	public void setSend(String send) {
		this.send = send;
	}
	public String[] getLike() {
		return like;
	}
	public void setLike(String[] like) {
		this.like = like;
	}
	public String[] getComment() {
		return comment;
	}
	public void setComment(String[] comment) {
		this.comment = comment;
	}
	

}
