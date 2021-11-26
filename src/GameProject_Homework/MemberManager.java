package GameProject_Homework;

public class MemberManager implements IMemberService{

    private IMemberCheckService iMemberCheckService;

    public MemberManager(IMemberCheckService iMemberCheckService){
        this.iMemberCheckService=iMemberCheckService;
    }

    @Override
    public void add(Member member) {
        if (iMemberCheckService.checkIfRealPerson(member)){
            System.out.println(member.getUserName() + " registered");
        }else{
            System.out.println("Not Valid!");
        }
    }

    @Override
    public void update(Member member) {

    }

    @Override
    public void delete(Member member) {

    }

    @Override
    public void ownedGames(Member member) {
        if (member.getGames().size()==0){
            System.out.println("Henüz Bir Oyuna Sahip Değil");
        }else{
            for (Game game: member.getGames()) {
                System.out.println("Oyun Sayısı : " + member.getGames().size());
                System.out.println(game.getName());
            }
        }
    }
}
