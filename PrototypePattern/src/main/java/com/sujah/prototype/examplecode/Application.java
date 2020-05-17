package com.sujah.prototype.examplecode;

public class Application {
    public static void main(String[] args) {

        Registry registry = new Registry();

        Car car1 = (Car) registry.getVehicle(VehicleType.CAR);
        System.out.println(car1);

        car1.setType("Luxury");
        System.out.println(car1);

        Car car2 = (Car) registry.getVehicle(VehicleType.CAR);
        System.out.println(car2);


    }
}
