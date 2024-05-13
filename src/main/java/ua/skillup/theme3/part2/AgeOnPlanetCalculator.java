package ua.skillup.theme3.part2;

public class AgeOnPlanetCalculator {
    public static double calculateAgeOnPlanet(int ageInYears, String planet) {
        // If the planet is not in the list, return -1
        double age;
        switch (planet) {
            case "Mercury" : age = ageInYears / 0.2408467;
            break;
            case "Venus" : age =  ageInYears / 0.61519726;
            break;
            case "Mars" : age = ageInYears / 1.8808158;
            break;
            case "Jupiter" : age = ageInYears / 11.862615;
            break;
            case "Saturn" : age =  ageInYears / 29.447498;
            break;
            case "Uranus" : age =  ageInYears / 84.016846;
            break;
            case "Neptune" : age =  ageInYears / 164.79132;
            break;
            default: throw new IllegalArgumentException("Unknown planet present: " + planet);
            }
            return age;
        }

    public static void main(String[] args) {
        int ageInYears = 10;
        String planet = "R2D2";
        double result = calculateAgeOnPlanet(ageInYears, planet);
        System.out.println(result);
    }
}
