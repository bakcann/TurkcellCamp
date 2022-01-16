package instagramOop1;
import java.sql.Date;

public class Story extends addShare {
	private String send;
	private String comment;
	private int timeLine;
	private int[] viewers;
	public Story() {
		super();
	}
	public Story(int id, String userName,String image, Date date ,String send, String comment, int timeLine, int[] viewers) {
		super(id, userName,image, date);
		this.send = send;
		this.comment = comment;
		this.timeLine = timeLine;
		this.viewers = viewers;
	}
	public String getSend() {
		return send;
	}
	public void setSend(String send) {
		this.send = send;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public int getTimeLine() {
		return timeLine;
	}
	public int[] getViewers() {
		return viewers;
	}
	

}
