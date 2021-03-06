package gameLand.dataAccess.concretes.jdbcImpls;

import gameLand.dataAccess.abstracts.CampaignDao;
import gameLand.entities.concretes.Campaign;

public class CampaignJdbcImplsDao implements CampaignDao {

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getName()+ "kampanyası Jdbc'e eklendi.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName()+ "kampanyası Jdbc'den silindi.");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getName()+ "kampanyası Jdbc'de güncellendi.");
		
	}

}
