package ro.paneabogdan.citiesfromeurope;

import java.util.*;

public class SortedCities extends OddEvenCities {

    private List<String> sortedList = new ArrayList<>();
    private List<String> sortedListWithoutDuplicateLetters = new ArrayList<>();

    public List<String> getSortedList() {
        return sortedList;
    }

    public List<String> getSortedListWithoutDuplicateLetters() {
        return sortedListWithoutDuplicateLetters;
    }

    public void sortCitiesByLength() {
        String[] arr = new String[cities.size()];
        arr = cities.toArray(arr);
        Arrays.sort(arr, (a, b) -> Integer.compare(a.length(), b.length()));
        sortedList = Arrays.asList(arr);
    }

    public String removeDuplicateFromString(String word) {

        char[] chars = word.toCharArray();
        Set<Character> charSet = new LinkedHashSet<>();
        for (char c : chars) {
            charSet.add(c);
        }

        StringBuilder sb = new StringBuilder();
        for (Character character : charSet) {
            sb.append(character);
        }
        return sb.toString();
    }

    public void removeDuplicateFromList() {
       for(String city : sortedList) {
           sortedListWithoutDuplicateLetters.add(removeDuplicateFromString(city));
       }
    }

}
