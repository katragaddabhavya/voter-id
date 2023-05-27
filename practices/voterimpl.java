package practices;


public class voterimpl {
    public static void main(String[] args) {
        voter vote = new voter();
        vote.setName("john");
        vote.setAge(32);
        System.out.println(vote.getAgeCriteria());
    }
}
