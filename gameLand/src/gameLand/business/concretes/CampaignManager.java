package gameLand.business.concretes;



import gameLand.business.abstracts.CampaignService;
import gameLand.dataAccess.abstracts.CampaignDao;
import gameLand.entities.concretes.Campaign;
import gameLand.entities.concretes.Game;

public class CampaignManager implements CampaignService{
	private CampaignDao campaignDao;
	private Game game;

	public CampaignManager(CampaignDao campaignDao, Game game) {
		super();
		this.campaignDao = campaignDao;
		this.game = game;
	}

	@Override
	public void add(Campaign campaign) {
		if(game.getPrice()>=100) {
		this.game.setDiscountPrice(game.getPrice()-campaign.getDiscount());
		this.campaignDao.add(campaign);
		}else {
			System.out.println("Kampanyadan faydalanamadýnýz");
			this.campaignDao.add(campaign);
		}
		
	}

	@Override
	public void delete(Campaign campaign) {
		this.campaignDao.delete(campaign);
		
	}

	@Override
	public void update(Campaign campaign) {
		this.campaignDao.update(campaign);
		
	}

}
