package gameLand.business.concretes;


import gameLand.business.abstracts.GameService;
import gameLand.dataAccess.abstracts.GameDao;
import gameLand.entities.concretes.Game;

public class GameManager implements GameService {
	private GameDao gameDao;

	public GameManager(GameDao gameDao) {
		super();
		this.gameDao = gameDao;
	}

	@Override
	public void add(Game game) {
		this.gameDao.add(game);
		
	}

	@Override
	public void delete(Game game) {
		this.gameDao.delete(game);
		
	}

	@Override
	public void update(Game game) {
		this.gameDao.update(game);
		
	}

}
