package GameProject_Homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Member {
    private int id;
    private String userName;
    private String password;
    private String eMail;
    //private Game[] games;
    private List<Game> games = new ArrayList<>();

    public Member(int id, String userName, String password, String eMail) {
        this.setId(id);
        this.setUserName(userName);
        this.setPassword(password);
        this.seteMail(eMail);
    }

    public Member() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public List<Game> getGames() {
        /*for (Game game:games) {
            System.out.println(game.getName());
        }*/
        return games;
    }

    public void setGames(List<Game> games) {
        this.games = games;
    }

    /*public Game[] getGames() {
        return games;
    }

    public void setGames(Game[] games) {
        this.games = games;
    }*/
}
