package by.epam.learn.action;

import by.epam.learn.bean.Coin;

public class CompareCoin {
    public void compareDiameter(Coin first, Coin second) {
        double delta = first.getDiameter() - second.getDiameter();
        //int result = 0;

        if (delta > 0) {
            System.out.println("The first coin is more than second for " + delta);
            //result = 1;
        } else if (delta < 0) {
            System.out.println("The second coin is more than the first on " + -delta);
            //result = -1;
        } else {
            System.out.println("Coins have the same diameter");
        }
        //return result;

    }
}
