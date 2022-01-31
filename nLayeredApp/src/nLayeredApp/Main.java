package nLayeredApp;

import nLayeredApp.business.abstracts.CategoryService;
import nLayeredApp.business.abstracts.ProductService;
import nLayeredApp.business.concretes.CategoryManager;
import nLayeredApp.business.concretes.ProductManager;
import nLayeredApp.dataAccess.concretes.hibernateimpls.CategoryHibernateDao;
import nLayeredApp.dataAccess.concretes.hibernateimpls.ProductHibernateDao;

import nLayeredApp.entities.concretes.Category;
import nLayeredApp.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		ProductService productService = new ProductManager(new ProductHibernateDao());
		Product product1 = new Product(1,"Elma",15);
		Product product2 = new Product(2,"Armut",20);
		Product product3 = new Product(3,"Kavun",25);
		Product product4 = new Product(4,"Portakal",30);
		productService.add(product1);
		productService.add(product2);
		productService.add(product3);
		productService.update(product4);
		productService.delete(product2);
		Product listProduct[]=productService.getAll();
		for(Product productList : listProduct) {
			System.out.println(productList.getName());
		}
		CategoryService categoryService= new CategoryManager(new CategoryHibernateDao());

		Category category1= new Category(1,"Meyve");
		Category category2= new Category(2,"Sebze");
		Category category3= new Category(3,"Fast Food");
		categoryService.add(category1);
		categoryService.add(category2);
		categoryService.update(category3);
		categoryService.delete(category1);
		Category listCategory[]=categoryService.getAll();
		for(Category categoryList : listCategory) {
			System.out.println(categoryList.getName());
		}
	}

}
