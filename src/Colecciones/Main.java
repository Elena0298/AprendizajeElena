package Colecciones;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    static Map<String, String> mapa1 = new HashMap<String, String>();
    static Map<String, String> mapa2 = new TreeMap<String, String>();
    static Map<String, String> mapa3 = new LinkedHashMap<String, String>();


    public static void main(String[] args) {
        long start1 = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++){
            String dato = "dato "+i;
            mapa1.put(String.valueOf(i), dato);
        }
        long end1 = System.currentTimeMillis();

        long resta1 = end1 - start1;

        System.out.println("HashMap: "+resta1);

        long start2 = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++){
            String dato = "dato "+i;
            mapa2.put(String.valueOf(i), dato);
        }
        long end2 = System.currentTimeMillis();

        long resta2 = end2 - start2;

        System.out.println("TreeMap: "+resta2);

        long start3 = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++){
            String dato = "dato "+i;
            mapa3.put(String.valueOf(i), dato);
        }
        long end3 = System.currentTimeMillis();

        long resta3 = end3 - start3;

        System.out.println("LinkedHashMap: "+resta3);
    }
}
