package gameLand.dataAccess.abstracts;

import gameLand.entities.concretes.Campaign;

public interface CampaignDao {
	void add(Campaign campaign);
	void delete(Campaign campaign);
	void update(Campaign campaign);

}
