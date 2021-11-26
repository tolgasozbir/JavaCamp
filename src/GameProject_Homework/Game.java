package GameProject_Homework;

public class Game {
    private int id;
    private String name;
    private int year;
    private String developerCompany;
    private double price;
    private Campaign campaign; //=new Campaign("",0);
    private double priceAfterCampaign;

    public Game(int id, String name, int year, String developerCompany, double price) {
        this.setId(id);
        this.setName(name);
        this.setYear(year);
        this.setDeveloperCompany(developerCompany);
        this.setPrice(price);
        this.setCampaign(new Campaign("",0));
    }

    public Game(int id, String name, int year, String developerCompany,double price, Campaign campaign) {
        this.setId(id);
        this.setName(name);
        this.setYear(year);
        this.setDeveloperCompany(developerCompany);
        this.setPrice(price);
        this.setCampaign(campaign);
    }

    public Game() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDeveloperCompany() {
        return developerCompany;
    }

    public void setDeveloperCompany(String developerCompany) {
        this.developerCompany = developerCompany;
    }

    public double getPrice() {
        /*if (campaign.discount>0){
            return getPriceAfterCampaign();
        }else {
            return price;
        }*/
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Campaign getCampaign() {
        return campaign;
    }

    public void setCampaign(Campaign campaign) {
        this.campaign = campaign;
    }

    public double getPriceAfterCampaign() {
        if (getCampaign().discount>0){
            return (price - (campaign.discount*price/100));
        }
        else {
            return price;
        }
        //return (price - (campaign.discount*price/100));
    }
}
