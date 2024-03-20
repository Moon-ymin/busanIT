package stream.ex;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex13 {
    public static void main(String[] args) {
        record CityPopulation(String city, int population) {}

        List<CityPopulation> cityPopulations = Arrays.asList(
                new CityPopulation("New York", 8000000),
                new CityPopulation("Los Angeles", 4000000),
                new CityPopulation("Chicago", 2700000),
                new CityPopulation("New York", 7500000),
                new CityPopulation("Los Angeles", 3800000),
                new CityPopulation("Chicago", 2600000)
        );

        Map<String, Double> cityPop = cityPopulations.stream()
                .collect(Collectors.groupingBy(CityPopulation::city,
                        Collectors.averagingInt(CityPopulation::population))
                );

        System.out.printf("New York 평균 인구: %.1f명\n", cityPop.get("New York"));
        System.out.printf("Chicago 평균 인구: %.1f명\n", cityPop.get("Chicago"));
        System.out.printf("Los Angeles 평균 인구: %.1f명\n", cityPop.get("Los Angeles"));
    }
}
