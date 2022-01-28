package gameLand.dataAccess.abstracts;

import gameLand.entities.concretes.Game;

public interface GameDao {
  public void add(Game game);
  public void delete(Game game);
  public void update(Game game);
}
