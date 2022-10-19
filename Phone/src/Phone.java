public class Phone {


    public int number= 0 ;
    public String model = "" ;
    public double weight = 0;

public Phone (int number, String model, int weight){
this.number = this.number + number;
this.model = this.model + model;
this.weight = this.weight + weight;

}

    public int getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }

}
