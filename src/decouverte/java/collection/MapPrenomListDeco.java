package decouverte.java.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapPrenomListDeco
{
    public static void main(String[] args)
    {
        Map<String, List<Personne>> dico = new HashMap<>();
        List<Personne> temp;

        for(Personne p : PersonneFactory.getPersonnesTab())
        {
            temp = dico.get(p.getFirstName());

            if(temp == null)
            {
                temp = new ArrayList<>();
                dico.put(p.getFirstName(), temp);
            }

            temp.add(p);
        }

        for(Map.Entry<String, List<Personne>> e: dico.entrySet())
        {
            System.out.println(e.getKey());
            for(Personne p : e.getValue())
                System.out.println("    "+p);
        }

    }
}
