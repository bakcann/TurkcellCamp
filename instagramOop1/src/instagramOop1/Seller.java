package instagramOop1;



public class Seller extends SignUp {
	private String about;
	private String adress;
	private String[] images;
	
	public Seller() {
		super();
	}
	public Seller(int id, String phoneNumber,String eMail, String name,String userName,String password, String about, String adress,String[]  images) {
		super(id,phoneNumber,eMail,name,userName,password);
		this.about = about;
		this.adress = adress;
		this.images=images;
		
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String[] getImages() {
		return images;
	}
	public void setImages(String[] images) {
		this.images = images;
	}

	

}
