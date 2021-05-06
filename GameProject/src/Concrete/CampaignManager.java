package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getName()+" "+ campaign.getProduct()+" �r�n� i�in olu�turuldu");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getName()+" "+ " kampanyas� g�ncellendi");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName()+ " kampanyas� kald�r�ld�.");
		
	}

}
