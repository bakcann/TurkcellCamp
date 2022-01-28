package gameLand.business.concretes;

import gameLand.business.abstracts.SaleService;
import gameLand.dataAccess.abstracts.SaleDao;
import gameLand.entities.concretes.Campaign;
import gameLand.entities.concretes.Game;
import gameLand.entities.concretes.Sale;
import gameLand.entities.concretes.User;

public class SaleManager implements SaleService {
	private SaleDao saleDao;
	private Game game;
	private User user;
	private Campaign campaign;
	

	public SaleManager(SaleDao saleDao, Game game, User user, Campaign campaign) {
		super();
		this.saleDao = saleDao;
		this.game = game;
		this.user = user;
		this.campaign = campaign;
	}

	
	@Override
	public void add(Sale sale, User user) {
		if(game.getPrice()>=100) {
		System.out.println(user.getFirstName()+"," + campaign.getName()+ "isimli kampanyadan faydalandý.");
		sale.setGame(game);
		sale.setUser(user);
		sale.setCampaign(campaign);}
		this.saleDao.add(sale);
		
	}

	@Override
	public void delete(Sale sale) {
		this.saleDao.delete(sale);
		
	}

	@Override
	public void update(Sale sale) {
		this.saleDao.update(sale);
		
	}

}
