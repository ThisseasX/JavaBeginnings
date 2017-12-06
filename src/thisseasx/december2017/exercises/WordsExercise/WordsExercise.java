package thisseasx.december2017.exercises.WordsExercise;

import com.sun.xml.internal.ws.util.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Map.Entry;

public class WordsExercise {

    public static void main(String[] args) throws IOException {
        InputStream stream = WordsExercise.class.getResourceAsStream("book.txt");
        InputStreamReader isr = new InputStreamReader(stream);
        BufferedReader br = new BufferedReader(isr);

        List<String> list = new ArrayList<>();

        while (br.ready()) {
            String line = br.readLine();
            line = line.toLowerCase();
            line = line.replaceAll("[^A-Za-z]", " ");
            String[] words = line.split("(\\s+)");
            list.addAll(Arrays.asList(words));
        }

        Set<String> wordSet = new TreeSet<>();
        wordSet.addAll(list);

        Map<String, Integer> unSortedMap = new HashMap<>();
        for (String word : wordSet) {
            int value = Collections.frequency(list, word);
            unSortedMap.put(word, value);
        }

        Map<String, Integer> sortedMap = new TreeMap<>(new ValueComparator(unSortedMap));
        sortedMap.putAll(unSortedMap);

        printMapEntries(sortedMap, 50);
    }

    @SuppressWarnings("SameParameterValue")
    private static void printMapEntries(Map<String, Integer> sortedMap, int lowerLimit) {
        Set<Entry<String, Integer>> entrySet = sortedMap.entrySet();
        for (Entry<String, Integer> entry : entrySet) {
            if (entry.getValue() >= lowerLimit) {
                System.out.printf("%-3s : %s\n", entry.getValue(), StringUtils.capitalize(entry.getKey()));
            }
        }
    }
}
