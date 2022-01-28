package gameLand.dataAccess.concretes.jdbcImpls;

import gameLand.dataAccess.abstracts.GameDao;
import gameLand.entities.concretes.Game;

public class GameJdbcImplsDao implements GameDao{

	@Override
	public void add(Game game) {
		System.out.println(game.getName()+ "oyunu Jdbc'e eklendi.");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName()+ "oyunu Jdbc'den silindi.");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName()+ "oyunu Jdbc'de güncellendi.");
		
	}

}
