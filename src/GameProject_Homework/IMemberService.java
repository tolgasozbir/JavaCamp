package GameProject_Homework;

public interface IMemberService {
    void add(Member member);
    void update(Member member);
    void delete(Member member);
    void ownedGames(Member member);
}
