package collection.list.ex.ex4_1;

public class Candidate {
    String name;
    int votes;

    public Candidate(String name) {
        this.name = name;
        this.votes = 0;
    }

    public String getName() {
        return name;
    }

    public int getVotes() {
        return votes;
    }
    public void receiveVote(){
        votes++;
    }

    @Override
    public String toString() {
        return name + ": " + votes + "표";
    }
}
