package org.example;

public class ParkApp {
    public static void main(String[] args) {
        Park park = new Park(5);
        Park.Attraction attraction1 = park.new Attraction(
                "Wheel",
                "10:00-18:00",
                300);
        park.getAttractions()[0] = attraction1;

        park.getAttractions()[0].printInfo();
    }
}
