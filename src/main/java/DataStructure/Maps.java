package DataStructure;

import java.util.HashMap;
import java.util.Map;

public class Maps {

    public static void main(String[] args) {
        Map<String, Integer> myMap = new HashMap<String, Integer>();

        myMap.put("Chris", (Integer) 321);
        myMap.put("JingJing", (Integer) 2385);
        myMap.put("Colin", (Integer) 231);


        System.out.println(myMap);

    }
}
