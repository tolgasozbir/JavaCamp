package GameProject_Homework;

public class CampaignManager implements ICampaignService{

    @Override
    public void generalDiscount(Game[] games,Campaign campaign) {
        for (Game game:games) {
            if (game.getCampaign().discount<campaign.discount){
                game.getCampaign().discount=campaign.discount;
            }
        }
    }

    @Override
    public void gameSpecificDiscount(Game game,double specialDiscount) {
        game.getCampaign().campaignName= game.getName() + " Special Discount";
        game.getCampaign().discount=specialDiscount;
    }

    @Override
    public void updateCampaign(Campaign campaign, String newCampaignName, double newDiscount) {
        campaign.campaignName=newCampaignName;
        campaign.discount=newDiscount;
    }

    @Override
    public Campaign delete(Campaign campaign) {
        return campaign=null;
    }
}
