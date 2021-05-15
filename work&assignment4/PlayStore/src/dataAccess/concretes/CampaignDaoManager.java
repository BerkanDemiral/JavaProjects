package dataAccess.concretes;

import dataAccess.abstracts.CampaignDaoService;
import entity.concretes.Campaign;

public class CampaignDaoManager implements CampaignDaoService{

	@Override
	public void create(Campaign campaign) {
		System.out.println("New campaign created.. 15% discount on selected products :" + campaign.getDiscountPercent());
		
	}

	@Override
	public void finished(Campaign campaign) {
		System.out.println("This campaign finished: "+ campaign.getCampaignCode());
		
	}

}
