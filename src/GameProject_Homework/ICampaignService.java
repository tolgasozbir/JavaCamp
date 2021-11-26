package GameProject_Homework;

public interface ICampaignService {
    void generalDiscount(Game[] games,Campaign campaign);
    void gameSpecificDiscount(Game game,double specialDiscount);
    void updateCampaign(Campaign campaign,String newCampaignName,double newDiscount);
    Campaign delete(Campaign campaign);
}
