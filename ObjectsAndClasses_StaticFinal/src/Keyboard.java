public class Keyboard {



    private final int type = 0;
    private final int lights = 0;
    private final double weight = 0;

    public void addKeyboard (String type, int lights, double weight){
        if (lights >= 1) {
            System.out.println("YES");
        } else {
            lights = 2;
            {
                System.out.println("NO");
            }
        }


    }

    public int getType() {
        return type;
    }

    public int Lights() {
        return lights;
    }

    public double getWeight() {
        return weight;
    }

}
