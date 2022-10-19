import java.util.Scanner;
final class Keyboard {

    private String type = "";
    private String lights = "";
    private double keyboardWeight = 0;


    public Keyboard(String type, String lights, double keyboardWeight) {
        this.type = type;
        this.lights = lights;
        this.keyboardWeight = keyboardWeight;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLights() {
        return lights;
    }

    public void setLights(String lights) {
        this.lights = lights;
    }

    public double getKeyboardWeight() {
        return keyboardWeight;
    }
    public void setKeyboardWeight(double keyboardWeight) {
        this.keyboardWeight = keyboardWeight;
    }
    public String toString() {
        return "Данные о клавиатуре:" + "\n" + "\n" +
                "Тип: " + getType() + "\n" +
                "Подсветка: " + getLights() + "\n" +
                "Вес:" + getKeyboardWeight();

    }

}