import java.io.*;

public class FuelRequirement {

    int fuelRequired;
    int fuelRequiredTotal;

    public int getFuel() {

        try (BufferedReader br = new BufferedReader(new FileReader("/Users/kristiinake/IdeaProjects/AdventOfCode2019/Files/day1_input"))) {
            String line;
            while ((line = br.readLine()) != null) {
                int mass = Integer.parseInt(line);
                fuelRequired = Math.round(mass / 3) - 2;
                fuelRequiredTotal = fuelRequired + fuelRequiredTotal;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(fuelRequiredTotal);
        return fuelRequiredTotal;
    }
}