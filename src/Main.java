import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<Integer, String> ourMap = new HashMap<>();
        ourMap.put(1, "Hello");
        ourMap.put(2, "DCI");
        ourMap.put(4, "Students");
        System.out.println(ourMap);

        ourMap.put(2, "some");
        System.out.println(ourMap);

        ourMap.remove(2);
        System.out.println(ourMap);

        String value = ourMap.get(4);
        System.out.println(value);

        System.out.println(ourMap.size());

        System.out.println(ourMap.containsKey(1));
        System.out.println(ourMap.containsKey(3));

        System.out.println(ourMap.containsValue("some"));
        System.out.println(ourMap.containsValue("Hello"));

        // iterating using key set
        Set<Integer> keySet = ourMap.keySet();
        for (Integer key : keySet) {
            System.out.printf("Value stored for the key %d is %s%n", key, ourMap.get(key));
        }

        // iterating using values collection
        Collection<String> values = ourMap.values();
        for (String val : values) {
            System.out.println(val);
        }

        // iterating using entry set
        Set<Map.Entry<Integer, String>> entrySet = ourMap.entrySet();
        for (Map.Entry<Integer, String> entry : entrySet) {
            System.out.println(entry);
            Integer key = entry.getKey();
            if (key == 4) {
                entry.setValue("World");
            }
            String val = entry.getValue();
            System.out.printf("Value stored for the key %d is %s%n", key, val);
        }

        Map<String, LocalDate> dateMap = new HashMap<>();
        dateMap.put("today", LocalDate.now());
        dateMap.put("yesterday", LocalDate.of(2024, Month.FEBRUARY, 8));
        dateMap.put("tomorrow", LocalDate.of(2024, Month.FEBRUARY, 10));
        System.out.println(dateMap);
        System.out.println("Yesterday's date: " + dateMap.get("yesterday"));
        dateMap.remove("yesterday");
        if (dateMap.containsKey("yesterday")) {
            System.out.println("Yesterday's year: " + dateMap.get("yesterday").getYear());
        }
        dateMap.put("somedate", null);
        dateMap.put(null, null);
        dateMap.put(null, LocalDate.now());

        // printing all dates from the map in 3 different ways
        for (LocalDate date : dateMap.values()) {
            System.out.println(date);
        }
        for (String key : dateMap.keySet()) {
            System.out.println("key: " + key + " date: " + dateMap.get(key));
        }
        for (Map.Entry<String, LocalDate> entry : dateMap.entrySet()) {
            System.out.println(entry.getValue());
        }

        // TreeMap
        Map<String,Integer> devices = new TreeMap<>();
        devices.put("laptop", 1);
        devices.put("tablet", 2);
        devices.put("mobile", 3);
        devices.put("mobile", 10); // doing the update
        devices.put("printer", 10);
        devices.put("printer", null);
        System.out.println(devices);
    }
}