/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kata2;

/**
 *
 * @author said
 */
import java.util.HashMap;
import java.util.Map;

public class HistogramGenerator<T> {
    private final T[] data;

    public HistogramGenerator(T[] data) {
        this.data = data;
    }
    
    Map<T, Integer> getHistogram() {
        Map<T, Integer> map = new HashMap<>();
        
        for (T data1 : data) {
            map.put(data1, map.containsKey(data1) ? map.get(data1) + 1 : 1);
        }
        return map;
    }
}