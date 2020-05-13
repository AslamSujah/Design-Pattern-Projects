package com.sujah.prototype.examplecode;

import java.util.HashMap;
import java.util.Map;

public class Registry {

    private Map<VehicleType, Vehicle> vehicles = new HashMap<VehicleType, Vehicle>();

    public Registry() {
        this.initialize();
    }

    public Vehicle getVehicle(VehicleType vehicleType){
        Vehicle vehicle = null;
        try {
            vehicle = (Vehicle) vehicles.get(vehicleType).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return vehicle;
    }

    private void initialize() {
        Car car = new Car();
        car.setFuelType("Gasoline");
        car.setEngineCapacity(2000);
        car.setType("Mini");

        Bus bus = new Bus();
        bus.setFuelType("Diesel");
        bus.setEngineCapacity(3000);
        bus.setNumberOfSeats(40);

        vehicles.put(VehicleType.CAR, car);
        vehicles.put(VehicleType.BUS, bus);

    }
}
