package nLayeredApp.dataAccess.concretes.jdbcimpls;



import nLayeredApp.core.entities.Entity;
import nLayeredApp.core.utilities.MyArrayList;
import nLayeredApp.dataAccess.abstracts.CategoryDao;
import nLayeredApp.entities.concretes.Category;

public class CategoryJdbcDao implements CategoryDao{
	private MyArrayList<Category> myArrayList = new MyArrayList<Category>();


	public CategoryJdbcDao() {
		super();
	}

	public CategoryJdbcDao(MyArrayList<Category> myArrayList) {
		super();
		this.myArrayList = myArrayList;
	}

	@Override
	public void add(Category category) {
		this.myArrayList.add(category);
		System.out.println("JDBC ile eklendi");
		
	}

	@Override
	public void update(Category category) {
		this.myArrayList.update(category.getId(), category);
		System.out.println("JDBC ile güncellendi");
		
	}

	@Override
	public void delete(Category category) {
		this.myArrayList.delete(category.getId());
		System.out.println("JDBC'den silindi");
		
	}

	@Override
	public Category[] getAll() {
		if (this.myArrayList.getAll() != null) {
			Category[] category = new Category[this.myArrayList.getAll().length];
			Entity[] entity = this.myArrayList.getAll();
			for (int i = 0; i < category.length; i++) {
				category[i] = (Category) entity[i];
			}
			return category;
		} else {
			return null;
		}
	}

}
