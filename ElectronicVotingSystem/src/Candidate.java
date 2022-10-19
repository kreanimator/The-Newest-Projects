import java.util.Scanner;

public class Candidate {

    private String name;
    private int voices;

    public Candidate(String name){
        this.name=name;
    }
    public String addCandidate(){
        name = String.valueOf(new Scanner(System.in));
        return name;
    }
    public void addVoice(int voices){
        voices++;

    }
    public String getName() {

        return name;
    }
    public int getVoices(int voices) {

        return voices;
    }
    @Override
    public String toString() {
        return "Candidate: " + "\n" +
                "Name: " + name + '\n' +
                "Voice: " + voices + "\n";
    }
}
