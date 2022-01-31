package nLayeredApp.dataAccess.concretes.jdbcimpls;



import nLayeredApp.core.entities.Entity;
import nLayeredApp.core.utilities.MyArrayList;
import nLayeredApp.dataAccess.abstracts.ProductDao;
import nLayeredApp.entities.concretes.Product;

public class ProductJdbcDao implements ProductDao{
	private MyArrayList<Product> myArrayList = new MyArrayList<Product>();

	public ProductJdbcDao() {
		super();
	}

	public ProductJdbcDao(MyArrayList<Product> myArrayList) {
		super();
		this.myArrayList = myArrayList;
	}

	@Override
	public void add(Product product) {
		//jdbc kodlarý
		System.out.println("JDBC ile eklendi");
		this.myArrayList.add(product);
		
	}

	@Override
	public void update(Product product) {
		System.out.println("JDBC ile güncellendi");
		this.myArrayList.update(product.getId(), product);
		
	}

	@Override
	public void delete(Product product) {
		System.out.println("JDBC ile silindi");
		this.myArrayList.delete(product.getId());
		
	}

	@Override
	public Product[] getAll() {
		if (this.myArrayList.getAll() != null) {
			Product[] product = new Product[this.myArrayList.getAll().length];
			Entity[] entity = this.myArrayList.getAll();
			for (int i = 0; i < product.length; i++) {
				product[i] = (Product) entity[i];
			}
			return product;
		} else {
			return null;
		}
	}

}
