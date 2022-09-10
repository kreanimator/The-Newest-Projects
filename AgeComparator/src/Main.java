import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int vasyaAge = 110;
        int katyaAge = 3;
        int mishaAge = 40;
        int min = -1; //TODO age min
        int middle = -1; //TODO age middle
        int max = -1; // TODO age max


        if (katyaAge <= vasyaAge && katyaAge <= mishaAge) {min = katyaAge;}
        else if (katyaAge >= vasyaAge && katyaAge <= mishaAge) {middle = katyaAge;}
        else if (katyaAge >= mishaAge && katyaAge <= vasyaAge) {middle = katyaAge;}
        else if (katyaAge >= vasyaAge && katyaAge >= mishaAge) {max = katyaAge;}
        else System.out.println("Katya gone wrong:(");

        if (vasyaAge <= katyaAge && vasyaAge <= mishaAge) {min = vasyaAge;}
        else if (vasyaAge >= katyaAge && vasyaAge <= mishaAge) {middle = vasyaAge;}
        else if (vasyaAge >= mishaAge && vasyaAge <= katyaAge) {middle = vasyaAge;}
        else if (vasyaAge >= katyaAge && vasyaAge >= mishaAge) {max = vasyaAge;}
        else System.out.println("Vasya gone wrong:(");

        if (mishaAge <= katyaAge && mishaAge <= vasyaAge) {min = mishaAge;}
        else if (mishaAge >= katyaAge && mishaAge <= vasyaAge) {middle = mishaAge;}
        else if (mishaAge >= vasyaAge && mishaAge <= katyaAge) {middle = mishaAge;}
        else if (mishaAge >= vasyaAge && mishaAge >= katyaAge) {max = mishaAge;}
        else System.out.println("Misha gone wrong :(");



                        System.out.println("Minimal Age:" + min);
                        System.out.println("Middle Age" + middle);
                        System.out.println("Maximum Age" + max);

                }
            }




