package ua.skillup.theme3.part2;

public class AgeOnPlanetCalculator {
    public static double calculateAgeOnPlanet(int ageInYears, String planet) {
        if(ageInYears < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }

        return switch (planet) {
            case "Mercury" -> ageInYears / 0.2408467;
            case "Venus" -> ageInYears / 0.61519726;
            case "Mars" -> ageInYears / 1.8808158;
            case "Jupiter" -> ageInYears / 11.862615;
            case "Saturn" -> ageInYears / 29.447498;
            case "Uranus" -> ageInYears / 84.016846;
            case "Neptune" -> ageInYears / 164.79132;
            default -> throw new IllegalArgumentException("Unknown planet: " + planet);
        };
    }

    public static void main(String[] args) {
        int ageInYears = 1;
        String planet = "Mars";
        double result = calculateAgeOnPlanet(ageInYears, planet);
        System.out.println(result);
    }
}
