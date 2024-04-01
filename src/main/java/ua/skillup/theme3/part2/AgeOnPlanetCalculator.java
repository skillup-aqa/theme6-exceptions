package ua.skillup.theme3.part2;

public class AgeOnPlanetCalculator {
    public static double calculateAgeOnPlanet(int ageInYears, String planet) {
        // If the planet is not in the list, return -1
        return switch (planet) {
            case "Mercury" -> ageInYears / 0.2408467;
            case "Venus" -> ageInYears / 0.61519726;
            case "Mars" -> ageInYears / 1.8808158;
            case "Jupiter" -> ageInYears / 11.862615;
            case "Saturn" -> ageInYears / 29.447498;
            case "Uranus" -> ageInYears / 84.016846;
            case "Neptune" -> ageInYears / 164.79132;
            default -> {
                System.out.println("Unknown planet: " + planet);
                yield -1;
            }
        };
    }

    public static void main(String[] args) {
        int ageInYears = 1;
        String planet = "Mars";
        double result = calculateAgeOnPlanet(ageInYears, planet);
        System.out.println(result);
    }
}
