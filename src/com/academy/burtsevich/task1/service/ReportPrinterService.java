package com.academy.burtsevich.task1.service;

import com.academy.burtsevich.task1.aircrafts.Aircraft;
import com.academy.burtsevich.task1.airline.Airline;

import java.util.List;

public class ReportPrinterService {




    public void printTotalCapacity(Airline airline) {
        int totalCapacity = airline.getAirlineStatistics().getTotalCapacity(airline);
        System.out.println("\n                               ***                               ");
        System.out.printf("%s \"%s\" - %s человек\n", "Общая пассажировместимость авиапарка", airline.getAirlinesName(), totalCapacity);
    }

    public void printTotalLoadCapacity(Airline airline) {
        double totalLoadCapacity = airline.getAirlineStatistics().getTotalLoadCapacity(airline);
        System.out.println("\n                               ***                               ");
        System.out.printf("%s \"%s\" - %s кг\n", "Общая грузоподъемность авиапарка", airline.getAirlinesName(), totalLoadCapacity);
    }

    public void printAircraftSortedByConsumptionRange(Airline airline, int min, int max) {
        List<Aircraft> byFuelConsumptionRange = airline.getAirlineStatistics().getAircraftByFuelConsumptionRange(airline, min, max);
        System.out.println("\n                               ***                               ");
        System.out.printf("%s %s до %s кг топлива на час полета:\n", "Л/а, потребляющие от", min, max);
        System.out.println("---------------------------------------");
        System.out.printf("%-10s%-15s%-10s\n", "рег.№", "модель", "расход топлива");
        System.out.println("---------------------------------------");
        byFuelConsumptionRange.forEach(aircraft -> System.out.printf("%-10s%-15s%-4s кг/час\n", aircraft.getRegistrationNumber(), aircraft.getModel(), aircraft.getFuelConsumption()));
        System.out.println("---------------------------------------");
    }

    public void printFleetSortedByRangeOfFlight(Airline airline){
        List<Aircraft> aircrafts = new FleetService().sortFleetByRangeOfFlight(airline.getAirFleet());
        System.out.println("\n                               ***                               ");
        System.out.printf("Воздушный флот авиакомпании %s: \n(сортировка по дальности полета)\n",airline.getAirlinesName());
        System.out.println("---------------------------------------");
        System.out.printf("%-10s%-15s%-10s\n", "рег.№", "модель", "дальность");
        System.out.println("---------------------------------------");
        aircrafts.forEach(aircraft -> System.out.printf("%-10s%-15s%-4s км\n", aircraft.getRegistrationNumber(), aircraft.getModel(), aircraft.getRange()));
        System.out.println("---------------------------------------");
    }
}
