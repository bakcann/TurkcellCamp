package gameLand.entities.concretes;

import gameLand.entities.abstracts.Entity;

public class Sale implements Entity {
	private int id;
	private Game game;
	private User user;
	private Campaign campaign;
	public Sale() {
		super();
	}
	public Sale(int id, Game game, User user, Campaign campaign) {
		super();
		this.id = id;
		this.game = game;
		this.user = user;
		this.campaign = campaign;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Game getGame() {
		return game;
	}
	public void setGame(Game game) {
		this.game = game;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Campaign getCampaign() {
		return campaign;
	}
	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}

}
