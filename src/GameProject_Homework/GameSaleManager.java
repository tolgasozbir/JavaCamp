package GameProject_Homework;

import java.util.List;

public class GameSaleManager implements IGameSaleService{

    @Override
    public void sell(Member member,Game game) {
        /*Member member = gameSale.getMember();
        List<Game> games = member.getGames();
        games.add(gameSale.getGame());
        member.setGames(games);*/

        List<Game> games = member.getGames();
        games.add(game);
        member.setGames(games);
        System.out.println(member.getUserName() + " " + game.getName() + " Satın Aldı");
    }
}
