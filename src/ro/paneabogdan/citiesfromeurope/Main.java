package ro.paneabogdan.citiesfromeurope;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //1
        String[] citiesArray = {"Paris", "Cluj-Napoca", "Timisoara", "Berlin", "Madrid", "Londra", "Barcelona", "Venetia", "Viena", "Iasi"};
        List<String> citiesArraylist = Arrays.asList(citiesArray);
        SortedCities sortedCities = new SortedCities();
        sortedCities.setCities(citiesArraylist);

        //2
        sortedCities.findOddCities();
        sortedCities.findEvenCities();
        sortedCities.generateEvenOddMap();
        sortedCities.generateFile("Cities_Map", sortedCities.getOddEvenMap());
        //sortedCities.getOddEvenMap().forEach((key, value) -> System.out.println(key + ":" + value));

        //3
        sortedCities.sortCitiesByLength();
        //System.out.println(sortedCities.getSortedList());
        sortedCities.removeDuplicateFromList();
        //System.out.println(sortedCities.getSortedListWithoutDuplicateLetters());
        sortedCities.generateFile("Sorted_List", sortedCities.getSortedListWithoutDuplicateLetters());

    }
}
