package gameLand.business.abstracts;

import gameLand.entities.concretes.Game;

public interface GameService {
	public void add(Game game);
	public void delete(Game game);
	public void update(Game game);

}
