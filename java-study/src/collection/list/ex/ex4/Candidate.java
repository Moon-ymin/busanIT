package collection.list.ex.ex4;

public class Candidate {
    private String name;
    private int votes;

    public Candidate(String name) {
        this.name = name;
        this.votes = 0;
    }
    public void receiveVote(){
        votes++;
    }

    public String getName() {
        return name;
    }

    public long getVotes() {
        return votes;
    }

    @Override
    public String toString() {
        return "이름 : %s, 득표 수 : %d".formatted(name, votes);
    }
}
