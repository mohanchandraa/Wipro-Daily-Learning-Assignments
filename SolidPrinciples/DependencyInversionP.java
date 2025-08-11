interface Appliance {
    void turnOn();
}
class WashingMachine implements Appliance {
    public void turnOn() {
        System.out.println("Washing Machine is running...");
    }
}
class Television implements Appliance {
    public void turnOn() {
        System.out.println("Television is now playing...");
    }
}
class Home {
    Appliance appliance;

    Home(Appliance appliance) {
        this.appliance = appliance;
    }

    void useAppliance() {
        appliance.turnOn();
    }
}
public class DependencyInversionP {
    public static void main(String[] args) {
        Appliance tv = new Television();
        Appliance wm = new WashingMachine();

        Home h1 = new Home(tv);
        h1.useAppliance();

        Home h2 = new Home(wm);
        h2.useAppliance();
    }
}
