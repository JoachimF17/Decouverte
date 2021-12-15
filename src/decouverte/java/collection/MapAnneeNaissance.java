package decouverte.java.collection;

import java.time.Year;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapAnneeNaissance
{
    public static void main(String[] args)
    {
        Map<Year, List<Personne>> map = new HashMap<>();
        List<Personne> temp;

        for(Personne p : PersonneFactory.getPersonnesTab())
        {
            temp = map.get(Year.of(p.getBirthDate().getYear()));

            if(temp == null)
            {
                temp = new ArrayList<>();
                map.put(Year.of(p.getBirthDate().getYear()), temp);
            }

            temp.add(p);
        }

        for(Map.Entry<Year, List<Personne>> e : map.entrySet())
        {
            System.out.printf("Né en %s : %n", e.getKey());
            for(Personne p : e.getValue())
                System.out.printf("-> %s%n",p);
        }
    }
}
