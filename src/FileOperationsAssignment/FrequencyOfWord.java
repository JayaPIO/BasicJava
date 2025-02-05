package FileOperationsAssignment;

import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class FrequencyOfWord {
    public static void main(String[] args) {
        String path = "C:\\Users\\JayaGokhlani\\IdeaProjects\\Java Basics\\src\\FileOperationsAssignment\\Destination";

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line = null;
            HashMap<String, Integer> map = new HashMap<>();
            while ((line = br.readLine()) != null) {
                String[] str = line.split(" ");
                for (String word : str) {
                    if (map.containsKey(word)) {
                        map.put(word, map.get(word) + 1);
                    } else {
                        map.put(word, 1);
                    }
                }
            }
            for (String key : map.keySet()) {
                System.out.println(key + ": " + map.get(key));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
