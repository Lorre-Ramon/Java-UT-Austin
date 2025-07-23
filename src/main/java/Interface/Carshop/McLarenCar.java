package Interface.Carshop;

public class McLarenCar implements Car {

    // Attributes
    double speed;
    double range;

    // Constructors
    public McLarenCar(double speed, double range) {
        this.speed = speed;
        this.range = range;
    }

    public double getMaxSpeed() {
        return this.speed;
    }

    public double getRange() {
        return range;
    }
}
