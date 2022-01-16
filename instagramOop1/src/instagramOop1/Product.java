package instagramOop1;
import java.sql.Date;
//Class Seller'dan satýcý fotograf ve userName almayý bulamadým.
public class Product {
	private int productId;
	private Date addDate;
	private String[] images;
	private String productName;
	private double price;
	private String productDetail;
	private String category;
	public Product() {
		super();
	}
	public Product( int productId, Date addDate, String[] images, String productName, double price, String productDetail,
			String category) {
		super();
		this.productId = productId;
		this.addDate = addDate;
		this.images = images;
		this.productName = productName;
		this.price = price;
		this.productDetail = productDetail;
		
		this.category=category;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public Date getAddDate() {
		return addDate;
	}
	public void setAddDate(Date addDate) {
		this.addDate = addDate;
	}
	public String[] getImages() {
		return images;
	}
	public void setImages(String[] images) {
		this.images = images;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getProductDetail() {
		return productDetail;
	}
	public void setProductDetail(String productDetail) {
		this.productDetail = productDetail;
	}

	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	
	

}
