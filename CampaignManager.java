
public class CampaignManager {
			public void showCampaign(Campaign campaign)
			{
				System.out.println(campaign.coorparateName + " m��terisi " + campaign.campaignName + " kampanyas�ndan yararland�.");
					
			}
			
			public void addCampaign(Campaign campaign)
			{
				System.out.println("Yeni kampanya eklendi.");

			}
			
			public void deleteCampaign(Campaign campaign)
			{
				System.out.println(campaign.campaignName+" kampanyas� silindi.");

			}
			
			public void updateCampaign(Campaign campaign)
			{
				System.out.println("Kampanya g�ncellendi.");
			}
}
