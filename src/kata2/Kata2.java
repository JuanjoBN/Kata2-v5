package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        int [] data= {1,1,1,1,0,0,2,3,3,3};
        Map<Integer,Integer> histogram= new HashMap<>();
        
        for (int key : data) {
            if(histogram.containsKey(data[i])){
                histogram.put(data[i], histogram.get(data[i]+ 1));
            }else{
                histogram.put(data[i], 1);
            }
            
        }
        
        for (int key : histogram.keySet()) {
            System.out.println(key + "==>" + histogram.get(key));
        }
    }
    
}
