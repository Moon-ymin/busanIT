package quiz.quiz6;

import java.util.Arrays;
import java.util.List;

public class q4 {
    public static void main(String[] args) {
        List<City> itinerary = Arrays.asList(
                new City("서울", Arrays.asList("경복궁", "남산타워", "북촌한옥마을")),
                new City("부산", Arrays.asList("해운대", "광안리", "태종대", "남산타워")),
                new City("제주", Arrays.asList("성산일출봉", "만장굴", "북촌한옥마을")));


        List<String> attractions = itinerary.stream()
                .flatMap(city -> city.getAttractions().stream())
                .distinct()
                .sorted()
                .toList();

        attractions.forEach(System.out::println);
    }
    public static class City {
        String name;
        List<String> attractions;

        public City(String name, List<String> attractions) {
            this.name = name;
            this.attractions = attractions;
        }

        public List<String> getAttractions() {
            return attractions;
        }
    }
}
