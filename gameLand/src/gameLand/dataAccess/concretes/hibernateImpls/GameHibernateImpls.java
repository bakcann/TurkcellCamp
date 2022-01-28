package gameLand.dataAccess.concretes.hibernateImpls;

import gameLand.dataAccess.abstracts.GameDao;
import gameLand.entities.concretes.Game;

public class GameHibernateImpls implements GameDao {

	@Override
	public void add(Game game) {
		System.out.println(game.getName()+ "oyunu Hibernate'e eklendi.");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName()+ "oyunu Hibernate'den silindi.");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName()+ "oyunu Hibernate'de güncellendi.");
		
	}

}
