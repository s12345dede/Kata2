
package kata2;

import java.util.Map;

/**
 *
 * @author said
 */
public class Kata2 {

    public static void main(String[] args) {
       String[] data = {"Jose", "Mario", "Sebas", "Aco", "Pepe", "Rosa","Mario","Jose","Jose"};
       
       HistogramGenerator histogramGenerator = new HistogramGenerator(data);
       Map<String, Integer> histogram = histogramGenerator.getHistogram();

        for (Map.Entry<String, Integer> entry: histogram.entrySet()) {
            System.out.println(entry.getKey() + "====>" + entry.getValue());
        }
    }
}
