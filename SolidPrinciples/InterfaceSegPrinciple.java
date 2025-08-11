interface AirBag {
    void openingAirBag();
}
interface Horn{
    void honking();
}
class Car implements AirBag,Horn {
    public void honking() {
        System.out.println("Car honked");
    }
    public void openingAirBag() {
        System.out.println("Airbags opened for Car");
    }
    
}
class Bike implements Horn {
    public void honking() {
        System.out.println("Bike honked");
    }
}
public class InterfaceSegPrinciple {
    public static void main(String[] args) {
        Car c = new Car();
        c.honking();
        c.openingAirBag();

        Bike b = new Bike();
        b.honking();
    }
}