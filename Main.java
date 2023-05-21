import java.util.Map;
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        HistogramCalculator calculator = new HistogramCalculator();
        String text = "Hello, World!";
        
        calculator.calculateHistogram(text);
        System.out.println("Absolutní histogram:");
        Map<Character, Integer> absoluteHistogram = calculator.getAbsoluteHistogram();
        printHistogram(absoluteHistogram);
        
        System.out.println("\nRelativní histogram:");
        Map<Character, Double> relativeHistogram = calculator.getRelativeHistogram();
        printHistogram(relativeHistogram);
    }
    
    private static void printHistogram(Map<Character, ? extends Number> histogram) {
        for (Map.Entry<Character, ? extends Number> entry : histogram.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
