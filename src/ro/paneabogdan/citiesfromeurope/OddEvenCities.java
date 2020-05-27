package ro.paneabogdan.citiesfromeurope;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OddEvenCities {
    protected List<String> cities = new ArrayList<>();
    private List<String> oddCities = new ArrayList<>();
    private List<String> evenCities = new ArrayList<>();
    private Map<String, List<String>> oddEvenMap = new HashMap<>();

    public void setCities(List<String> cities) {
        this.cities = cities;
    }

    public Map<String, List<String>> getOddEvenMap() {
        return oddEvenMap;
    }

    public void findOddCities() {
        for (String city : cities) {
            if(city.length() % 2 != 0) {
                oddCities.add(city);
            }
        }
    }

    public void findEvenCities() {
        for (String city : cities) {
            if(city.length() % 2 == 0) {
                evenCities.add(city);
            }
        }
    }

    public void generateEvenOddMap() {
        oddEvenMap.put("even",evenCities);
        oddEvenMap.put("odd",oddCities);
    }

    public void generateFile(String fileName, Object text) {
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(fileName + ".txt", "UTF-8");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        writer.println(text);
        writer.close();
    }


}
