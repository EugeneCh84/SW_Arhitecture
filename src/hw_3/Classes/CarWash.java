package hw_3.Classes;

import hw_3.Wiping;

public class CarWash {
    public CarWash() {
    }

    public void wash(Wiping vehicle) {
        System.out.println("Мойка автомобиля...");
        vehicle.wipMirrors();
        vehicle.wipWindshield();
        vehicle.wipHeadlights();
    }
}
