package gameLand;

import gameLand.business.abstracts.CampaignService;
import gameLand.business.abstracts.GameService;
import gameLand.business.abstracts.SaleService;
import gameLand.business.abstracts.UserService;
import gameLand.business.concretes.CampaignManager;
import gameLand.business.concretes.GameManager;
import gameLand.business.concretes.SaleManager;
import gameLand.business.concretes.UserManager;
import gameLand.core.concretes.MernisManager;
import gameLand.dataAccess.concretes.hibernateImpls.CampaignHibernateDao;
import gameLand.dataAccess.concretes.hibernateImpls.GameHibernateImpls;

import gameLand.dataAccess.concretes.jdbcImpls.SaleJdbcImplsDao;
import gameLand.dataAccess.concretes.jdbcImpls.UserJdbcImplsDao;
import gameLand.entities.concretes.Campaign;
import gameLand.entities.concretes.Game;
import gameLand.entities.concretes.Sale;
import gameLand.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		UserService userManager = new UserManager(new UserJdbcImplsDao(),new MernisManager());
		User user = new User(1,"Burak Can","Gültekin",1993,"1444440");
		userManager.add(user);
		
		GameService gameManager = new GameManager(new GameHibernateImpls());
		Game game = new Game(1,"Counter Strike",100,0);
		gameManager.add(game);
		
		CampaignService campaignManager = new CampaignManager(new CampaignHibernateDao(), game);
		Campaign campaign = new Campaign(1,"100 TL üzeri alýþveriþe 25TL indirim",100,25);
		campaignManager.add(campaign);
		
		SaleService saleManager= new SaleManager(new SaleJdbcImplsDao(), game, user, campaign) ;
		Sale sale = new Sale(1, game, user, campaign);
		saleManager.add(sale, user);
		System.out.println(game.getDiscountPrice());
		
		
		

	}

}
