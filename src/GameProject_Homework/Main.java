package GameProject_Homework;

public class Main {
    public static void main(String[] args) {

        Game game1=new Game(1,"Frostpunk",2018,"11 bit studio",50.00);
        Game game2=new Game(2,"Dota 2",2008,"Valve",5);
        Game game3=new Game(3,"Age of empires 2",2000,"Ensemble",20.00);
        Game game4=new Game(4,"This of war mine",2015,"11 bit studios",30);

        GameManager gameManager = new GameManager();
        gameManager.add(game1,game2,game3,game4);
        System.out.println("\n---Game List---");
        gameManager.gameList();

        Campaign campaignWinter=new Campaign();
        campaignWinter.campaignName="Kış İndirimi";
        campaignWinter.discount=30;

        CampaignManager campaignManager=new CampaignManager();
        campaignManager.generalDiscount(new Game[]{game1,game2,game3},campaignWinter);
        campaignManager.gameSpecificDiscount(game4,50);
        System.out.println("\nKampanyadan sonra");
        gameManager.gameList();

        System.out.println();
        Member member1=new Member(1,"Mulita","123mulita","mulita@gmail.com");
        Member member2=new Member(1,"test","testtest","test@hotmail.com");

        MemberManager memberManager=new MemberManager(new MemberCheckManager());
        memberManager.add(member1);
        memberManager.add(member2);
        System.out.println("\n" + member2.getUserName() + "'s Games");
        memberManager.ownedGames(member2);

        GameSaleManager gameSaleManager=new GameSaleManager();
        System.out.println("\n" + member1.getUserName() + "'s Games");
        gameSaleManager.sell(member1,game1);
        memberManager.ownedGames(member1);

    }
}
