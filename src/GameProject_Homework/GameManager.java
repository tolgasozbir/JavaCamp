package GameProject_Homework;

import java.util.List;

public class GameManager implements IGameService{
    @Override
    public void add(Game game) {
        System.out.println(game.getName() + " Added");
        avaibleGames.add(game);
    }

    @Override
    public void add(Game... games) {
        for (Game game:games) {
            System.out.println(game.getName() + " Added");
            avaibleGames.add(game);
        }
    }

    @Override
    public void gameList() {


        for (Game game:avaibleGames) {
            if (game.getCampaign().discount>0){
                System.out.println(game.getName() + "  ----  %" + game.getCampaign().discount + " İndirim " + game.getPrice() + "Tl Yerine " + game.getPriceAfterCampaign()+"Tl");
            }else{
                System.out.println(game.getName());
            }



        }
    }

    @Override
    public void update(Game game) {
        System.out.println(game.getName() + " Updated");
    }

    @Override
    public void delete(Game game) {
        System.out.println(game.getName() + " Deleted");
    }
}
