package by.epam.learn.bean;

public class Coin {

    public double diameter;
    private double weight;

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double value) {
        if (value > 0) {
            diameter = value;
        } else {
            System.out.println("Negative diameter !");
        }
    }


    public double getWeight() {
        return weight;
    }

    public void setWeight(double value) {
        if (value > 0) {
            weight = value;
        } else {
            System.out.println("Negative weight !");
        }
    }
}
