import java.util.HashMap;
import java.util.Map;

public class CharacterHistogram {
    private Map<Character, Integer> histogram;

    public CharacterHistogram() {
        histogram = new HashMap<>();
    }

    public void createHistogram(String text) {
        for (char c : text.toCharArray()) {
            if (Character.isUpperCase(c)) {
                histogram.put(c, histogram.getOrDefault(c, 0) + 1);
            } else {
                histogram.put('O', histogram.getOrDefault('O', 0) + 1);
            }
        }
    }

    public Map<Character, Integer> getAbsoluteHistogram() {
        return histogram;
    }

    public Map<Character, Double> getRelativeHistogram() {
        Map<Character, Double> relativeHistogram = new HashMap<>();
        int totalCount = 0;
        for (int count : histogram.values()) {
            totalCount += count;
        }
        for (Map.Entry<Character, Integer> entry : histogram.entrySet()) {
            double relativeFrequency = (double) entry.getValue() / totalCount;
            relativeHistogram.put(entry.getKey(), relativeFrequency);
        }
        return relativeHistogram;
    }
}
