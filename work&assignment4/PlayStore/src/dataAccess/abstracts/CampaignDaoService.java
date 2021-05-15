package dataAccess.abstracts;

import entity.concretes.Campaign;

public interface CampaignDaoService {
	void create(Campaign campaign);
	void finished(Campaign campaign);
}
