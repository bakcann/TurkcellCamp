package nLayeredApp.core.utilities;

import nLayeredApp.core.entities.Entity;

public class MyArrayList<T extends Entity> {
	private Entity[] temp;
	private Entity[] array;
	public MyArrayList() {
		super();
		array= new Entity[1];
	}
	public void add(T entity) {
		if(array[0]==null) {
			array[0]=entity;
		}else {
			temp=array;
			array= new Entity[temp.length+1];
			for(int i=0; i<temp.length; i++) {
				array[i]=temp[i];
			}
			array[array.length-1]=entity;
		}
	}
	public void update(int id, T updated) {
		for(int i=0; i<array.length; i++) {
			if(array[i].getId()==id) {
				array[i]=updated;
				return;
			}
		}
	}
	public void delete(int id) {
		int k=0;
		temp= new Entity[array.length-1];
		for(int i=0; i<array.length;i++) {
			if(array[i].getId()!=id) {
				temp[k]=array[i];
			}
		}array=temp;
	}
	public Entity[] getAll() {
		return array;
		
	}

}
