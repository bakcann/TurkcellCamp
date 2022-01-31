package core.dataAccess;

import core.entities.Entity;

public interface CrudRepository<T extends Entity> {
	public void add(T entity) ;

}
