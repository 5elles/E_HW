package com.academy.burtsevich.task1;

public class Main {
    public static void main(String[] args) {
        Airline airline = new Airline("The Last Way");
        AirlineStatistics airlineStatistics = new AirlineStatistics(airline);
        ReportPrinter reportPrinter = new ReportPrinter(airlineStatistics);
        airline.addAircraft(new Airplane(183, 164000, 3700, 4700, "Airbus A310", 10023));
        airline.addAircraft(new Airplane(149, 73500, 4900, 2500, "Airbus A320", 10024));
        airline.addAircraft(new Airplane(114, 52800, 2518, 2140, "Boeing-737", 10025));
        airline.addAircraft(new Airplane(19, 1710, 1040, 314, "L-410", 10026));
        airline.addAircraft(new Airplane(19, 1710, 1040, 314, "L-410", 10027));
        airline.addAircraft(new Helicopter(3, 1089, 680, 50, "Robinson R44", 20001));
        airline.addAircraft(new Helicopter(4, 1225, 602, 87, "Robinson R66", 20002));
        airline.addAircraft(new Helicopter(4, 1225, 602, 87, "Robinson R66", 20003));

        reportPrinter.printTotalCapacity();
        reportPrinter.printTotalLoadCapacity();
        reportPrinter.printAircraftByCnsmptnRange(314, 2500);
        reportPrinter.printSortedByRangeOfFlightFleet();
    }
}
