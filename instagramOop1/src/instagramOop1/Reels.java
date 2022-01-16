package instagramOop1;
import java.sql.Date;
public class Reels extends addShare{
	private String save;
	private String send;
	private String[] like;
	private String[] comment;
	private int timeLine;
	private String camera;
	public Reels() {
		super();
	}
	public Reels(int id,String userName, String image, Date date,String save, String send, String[] like, String[] comment, int timeLine, String camera) {
		super(id, userName, image, date);
		this.save = save;
		this.send = send;
		this.like = like;
		this.comment = comment;
		this.timeLine = timeLine;
		this.camera=camera;
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
	public int getTimeLine() {
		return timeLine;
	}
	public String getCamera() {
		return camera;
	}
	public void setCamera(String camera) {
		this.camera = camera;
	}
	
}
