package decouverte.java.collection;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDeco
{
    public static void main(String[] args)
    {
        Map<LocalDate, Personne> map = new TreeMap<>();
        LocalDate k1 = LocalDate.of(2000, 1, 1);
        LocalDate k2 = LocalDate.of(1990, 5, 14);
        LocalDate key;
        Personne value, remove1, remove2;

        for(Personne p : PersonneFactory.getPersonnesTab())
        {
            System.out.print(p+" ");
            Personne p2 = map.put(p.getBirthDate(), p);
            System.out.println(p2);
        }

        //System.out.println(map.keySet());
        //System.out.println(map.values());
        for(Map.Entry<LocalDate, Personne> e : map.entrySet())
        {
            key = e.getKey();
            value = e.getValue();
            System.out.printf("key = %s value = %s%n", key, value);
        }

        System.out.println(map.get(k1));
        System.out.println(map.get(k2));

        remove1 = map.remove(k1);
        remove2 = map.remove(k2);

        System.out.println(remove1);
        System.out.println(remove2);

    }
}
