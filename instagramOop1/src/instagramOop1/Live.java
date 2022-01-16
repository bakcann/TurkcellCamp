package instagramOop1;
import java.sql.Date;
public class Live extends addShare {
	private String[] sendHeart;
	private int[] watching;
	private String[] comment;
	private String joinStream;
	public Live() {
		super();
	}
	public Live(int id,String userName, String image, Date date,String[] sendHeart, int[] watching, String[] comment, String joinStream) {
		super(id, userName, image,date);
		this.sendHeart = sendHeart;
		this.watching = watching;
		this.comment = comment;
		this.joinStream = joinStream;
	}
	public String[] getSendHeart() {
		return sendHeart;
	}
	public void setSendHeart(String[] sendHeart) {
		this.sendHeart = sendHeart;
	}
	public String[] getComment() {
		return comment;
	}
	public void setComment(String[] comment) {
		this.comment = comment;
	}
	public String getJoinStream() {
		return joinStream;
	}
	public void setJoinStream(String joinStream) {
		this.joinStream = joinStream;
	}
	public int[] getWatching() {
		return watching;
	}
	
}
