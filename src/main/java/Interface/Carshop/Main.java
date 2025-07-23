package Interface.Carshop;

public class Main {

    public static void main(String[] args) {
        Car myP1 = new McLarenCar(300, 500);
        McLarenCar mySenna = new McLarenCar(350, 400);

        CarShop shop = new CarShop();

        shop.repair(myP1, 5000);
        shop.repair(mySenna, 5000);
    }
}
