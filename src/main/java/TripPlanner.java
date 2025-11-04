import java.util.Scanner;

public class TripPlanner {
    public static void main(String[] args) {
        // TODO: Get user input for trip details
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter trip distance (miles): ");
        double tripDistance = sc.nextDouble();
        System.out.print("Enter average speed (mph): ");
        double averageSpeed = sc.nextDouble();
        System.out.print("Enter fuel efficiency (miles per gallon): ");
        double fuelEfficiency = sc.nextDouble();
        System.out.print("Enter fuel price per gallon ($): ");
        double fuelPrice = sc.nextDouble();
        System.out.println(" ");
        double travelTime = calculateTravelTime(tripDistance, averageSpeed);
        double fuelNeeded = calculateFuelNeeded(tripDistance, fuelEfficiency);
        double tripCost = calculateTripCost(fuelNeeded, fuelPrice);
        displayResults(travelTime, fuelNeeded, tripCost);
    }
        // TODO: Calculate travel time using a return method
        public static double calculateTravelTime(double tripDistance, double averageSpeed) {
            double travelTime;
            travelTime = tripDistance / averageSpeed;
            return travelTime;
        }
        // TODO: Calculate fuel needed using a return method
        public static double calculateFuelNeeded(double tripDistance, double fuelEfficiency) {
            double fuelNeeded;
            fuelNeeded = tripDistance / fuelEfficiency;
            return fuelNeeded;
        }
        // TODO: Calculate trip cost using a return method
        public static double calculateTripCost(double fuelNeeded, double fuelPrice) {
        double tripCost;
        tripCost = fuelNeeded * fuelPrice;
        return tripCost;
        }
        // TODO: Display results using a void method
        public static void displayResults(double travelTime, double fuelNeeded, double tripCost) {
            System.out.println("Results:");
            System.out.printf("Travel Time: %.2f hours\n",travelTime);
            System.out.printf("Fuel Needed: %.2f gallons\n",fuelNeeded);
            System.out.printf("Trip Cost: $%.2f",tripCost);
        }
    }


