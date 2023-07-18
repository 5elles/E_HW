package com.academy.burtsevich.task1;

import java.util.LinkedList;
import java.util.List;

public class ReportPrinter {
    private final AirlineStatistics airlineStatistics;

    public ReportPrinter(AirlineStatistics airlineStatistics) {
        this.airlineStatistics = airlineStatistics;
    }

    public AirlineStatistics getAirlineStats() {
        return airlineStatistics;
    }


    public void printTotalCapacity() {
        int totalCapacity = airlineStatistics.getTotalCapacity();
        System.out.println("\n                               ***                               ");
        System.out.printf("%s \"%s\" - %s человек\n", "Общая пассажировместимость авиапарка", airlineStatistics.airline().getAirlinesName(), totalCapacity);
    }

    public void printTotalLoadCapacity() {
        double totalLoadCapacity = airlineStatistics.getTotalLoadCapacity();
        System.out.println("\n                               ***                               ");
        System.out.printf("%s \"%s\" - %s кг\n", "Общая грузоподъемность авиапарка", airlineStatistics.airline().getAirlinesName(), totalLoadCapacity);
    }

    public void printAircraftByCnsmptnRange(int min, int max) {
        List<Aircraft> byFuelCnsmptnRange = airlineStatistics.getAircraftByFuelCnsmptnRange(min, max);
        System.out.println("\n                               ***                               ");
        System.out.printf("%s %s до %s кг топлива на час полета:\n", "Л/а, потребляющие от", min, max);
        System.out.println("---------------------------------------");
        System.out.printf("%-10s%-15s%-10s\n", "рег.№", "модель", "расход топлива");
        System.out.println("---------------------------------------");
        byFuelCnsmptnRange.forEach(aircraft -> System.out.printf("%-10s%-15s%-4s кг/час\n", aircraft.getRegistrationNumber(), aircraft.getModel(), aircraft.getFuelConsumption()));
        System.out.println("---------------------------------------");
    }

    public void printSortedByRangeOfFlightFleet(){
        LinkedList<Aircraft> aircrafts = new FleetSorter().sortFleetByRangeOfFlight(airlineStatistics.airline().getAirFleet());
        System.out.println("\n                               ***                               ");
        System.out.printf("Воздушный флот авиакомпании %s: \n(сортировка по дальности полета)\n", airlineStatistics.airline().getAirlinesName());
        System.out.println("---------------------------------------");
        System.out.printf("%-10s%-15s%-10s\n", "рег.№", "модель", "дальность");
        System.out.println("---------------------------------------");
        aircrafts.forEach(aircraft -> System.out.printf("%-10s%-15s%-4s км\n", aircraft.getRegistrationNumber(), aircraft.getModel(), aircraft.getRange()));
        System.out.println("---------------------------------------");
    }
}
