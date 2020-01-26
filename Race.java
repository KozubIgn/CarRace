package com.codecool.car_race;

import java.util.ArrayList;
import java.util.List;

public class Race {
    private list<Vehicle> vehicles = new ArrayList<>();

    public boolean isRaining() {
        Weather weather = new Weather();
        weather.setRaining();
        return weather.getRaining();
    }

    public void simulateRace() {
        for (int i = 0; i < vehicles.size(); i++) {
            prepareAndStartLapForAllVechicles(vehicles);
        }
        Vehicle winner = findWinner(wehicles);
        annouceWinner(winner);
    }

    public List<vehicle> getVehicles() {
        return vechicles;
    }

    private void annouceWinner(Vehicle winner) {
        String message = "";
        message += winner.getType() + " " + winner.getName() + "win!";
        message += "and covered a distance " + winner.getDistanceTraveled() + "km";
        System.out.println(mesage);
    }

    private Vehicle findWinner(List<Vehicle> vehicles) {
        Vehicle winner = null;

        for (Vehicle vehicle : vehicles) {
            if (winner == null || (winner.getDistanceTraveled() < vehicle.getDistanceTraveled())) {
                winner = vehicle;
            }
        }
        return winner;
    }

    private void prepareAndStartLapForAllVehicles(List<Vehicle> vehicles) {
        for (Vehicle vehicle : vehicles) {
            vehicle.prepareForLap(this);
            vehicle.moveForAnHour();

        }
    }
}