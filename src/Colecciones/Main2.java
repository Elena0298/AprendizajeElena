package Colecciones;

import java.util.*;

public class Main2 {

    static Set<String> set1 = new HashSet<String>();
    static Set<String> set2 = new TreeSet<String>();
    static Set<String> set3 = new LinkedHashSet<String>();

    static Map<String, String> mapa1 = new HashMap<String, String>();

    public static void main(String[] args) {
        set1.add("Christian");
        set1.add("Elena");
        set1.add("Christian");

        /*mapa1.put("Christian", "27");
        mapa1.put("Elena", "22");
        mapa1.put("Christian", "30");*/

        for (String valor : set1){
            System.out.println(valor);
        }

        /*for (Map.Entry entry : mapa1.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }*/
    }
}
