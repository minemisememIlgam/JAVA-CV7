import java.util.Map;

public class CharacterHistogramTest {
   
    public static void main(String[] args) {
        CharacterHistogram histogram = new CharacterHistogram();
        String text = "Hello, World!";
        histogram.createHistogram(text);
        Map<Character, Integer> absoluteHistogram = histogram.getAbsoluteHistogram();
        System.out.println("Absolutní histogram:");
        for (Map.Entry<Character, Integer> entry : absoluteHistogram.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        Map<Character, Double> relativeHistogram = histogram.getRelativeHistogram();
        System.out.println("\nRelativní histogram:");
        for (Map.Entry<Character, Double> entry : relativeHistogram.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}