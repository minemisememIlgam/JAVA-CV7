import java.util.Map;

public class HistogramCalculator {
    private CharacterHistogram characterHistogram;

    public HistogramCalculator() {
        characterHistogram = new CharacterHistogram();
    }

    public void calculateHistogram(String text) {
        characterHistogram.createHistogram(text);
    }

    public Map<Character, Integer> getAbsoluteHistogram() {
        return characterHistogram.getAbsoluteHistogram();
    }

    public Map<Character, Double> getRelativeHistogram() {
        return characterHistogram.getRelativeHistogram();
    }
}