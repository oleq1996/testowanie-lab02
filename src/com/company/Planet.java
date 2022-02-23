package com.company;

public class Planet {

    String name;
    Position position;

    public Planet(String name, Position position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }

    public double calculateDistance(Planet anotherPlanet){

        double distance = Math.sqrt((this.position.getX() - anotherPlanet.position.getX())^2 + (this.position.getY()-anotherPlanet.position.getY()^2) + (this.position.getZ()-anotherPlanet.position.getZ()^2));

        return distance;
    }
}
