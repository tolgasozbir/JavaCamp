package GameProject_Homework;

import java.util.ArrayList;
import java.util.List;

public interface IGameService {
    List<Game> avaibleGames=new ArrayList<>();
    void add(Game game);
    void add(Game... games);
    void gameList();
    void update(Game game);
    void delete(Game game);
}
