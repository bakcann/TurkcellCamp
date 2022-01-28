package gameLand.dataAccess.concretes.hibernateImpls;

import gameLand.dataAccess.abstracts.CampaignDao;
import gameLand.entities.concretes.Campaign;

public class CampaignHibernateDao implements CampaignDao {

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getName()+ "kampanyas� Hibernate'e eklendi.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName()+ "kampanyas� Hibernate'den silindi.");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getName()+ "kampanyas� Hibernate'de g�ncellendi.");
		
	}

}
