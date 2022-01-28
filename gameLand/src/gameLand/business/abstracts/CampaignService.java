package gameLand.business.abstracts;

import gameLand.entities.concretes.Campaign;

public interface CampaignService {
	public void add(Campaign campaign);
	public void delete(Campaign campaign);
	public void update(Campaign campaign);

}
