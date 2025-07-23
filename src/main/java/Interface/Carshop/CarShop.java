package Interface.Carshop;

public class CarShop {

    public boolean repair(Car myCar, double cost) {

        if (myCar.getMaxSpeed() + myCar.getRange() / 100.0 > cost) {
            return true;
        } else {
            return false;
        }
    }
}
