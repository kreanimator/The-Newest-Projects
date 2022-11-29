import java.util.List;

public class Voting {

    private String title;
    private List <Candidate> candidates;

    public Voting(String title, List<Candidate>candidates){
        this.title =title;
        this.candidates=candidates;

    }

    public Voting() {

    }
}
