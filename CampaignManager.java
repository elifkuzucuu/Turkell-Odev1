
public class CampaignManager {
			public void showCampaign(Campaign campaign)
			{
				System.out.println(campaign.coorparateName + " müşterisi " + campaign.campaignName + " kampanyasından yararlandı.");
					
			}
			
			public void addCampaign(Campaign campaign)
			{
				System.out.println("Yeni kampanya eklendi.");

			}
			
			public void deleteCampaign(Campaign campaign)
			{
				System.out.println(campaign.campaignName+" kampanyası silindi.");

			}
			
			public void updateCampaign(Campaign campaign)
			{
				System.out.println("Kampanya güncellendi.");
			}
}
