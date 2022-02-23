package com.company;

public class PlanetDistance {

    public static double calculateDistance(Planet a, Planet b){

        double distance = Math.sqrt((a.position.getX() - b.position.getX())^2 + (a.position.getY()-b.position.getY()^2) + (a.position.getZ()-b.position.getZ()^2));

        return distance;
    }

}
