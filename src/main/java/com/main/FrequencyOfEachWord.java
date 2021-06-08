package com.main;
import java.util.HashMap;
import java.util.Map;

public class FrequencyOfEachWord {
    public static void main(String[] args) {
        String input = "this is test time or this is the best time";
        String[] str = extractWords(input);
        Map<String, Integer> stringCountMap = processData(str);
        printFrequencyOfEachWordMap(stringCountMap);
    }

    public static String[] extractWords(String text) {
        String[] words = text.split(" ");
        return words;
    }

    public static Map<String, Integer> processData(String[] words) {
        Map<String, Integer> stringCountMap = new HashMap<>();
        for (String word : words) {
            String wordss = word;
            if (stringCountMap.containsKey(word)) {
                int count = stringCountMap.get(word);
                stringCountMap.put(word, count + 1);
            } else {
                stringCountMap.put(word, 1);
            }
        }
        return stringCountMap;
    }

    public static void printFrequencyOfEachWordMap(Map<String, Integer> stringCountMap) {
        for (String key : stringCountMap.keySet()) {
            Integer count = stringCountMap.get(key);
            System.out.println("Key: " + key + " " + "Value: " + count);
        }
    }
}
