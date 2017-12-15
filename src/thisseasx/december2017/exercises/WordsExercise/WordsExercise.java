package thisseasx.december2017.exercises.WordsExercise;

import com.sun.xml.internal.ws.util.StringUtils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.Map.Entry;

public class WordsExercise {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(
                new FileReader(WordsExercise.class.getResource("book.txt").getPath())
        );

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
        input(unSortedMap);
    }

    private static void input(Map map) {
        System.out.println("\nType a word to search in the text:");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        if (map.containsKey(s)) {
            System.out.printf("The word '%s' appears %s times%n", s, map.get(s));
        }
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
