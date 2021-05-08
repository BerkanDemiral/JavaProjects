package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getName()+" "+ campaign.getProduct()+" ürünü için oluþturuldu");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getName()+" "+ " kampanyasý güncellendi");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName()+ " kampanyasý kaldýrýldý.");
		
	}

}
