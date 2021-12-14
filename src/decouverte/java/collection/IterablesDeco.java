package decouverte.java.collection;

import java.util.*;

public class IterablesDeco
{
    public static void main(String[] args)
    {
        //objets
        String s;
        Set<String> liste = new TreeSet<>();
        Iterable<String> iteFactory;
        Iterator<String> iterator;

        liste.add("toto");
        liste.add("toto");
        liste.add("toto");
        liste.add("dede");
        liste.add("luc");
        liste.add("pomme");

        iteFactory = liste;
        iterator = iteFactory.iterator();

        while(iterator.hasNext())
        {
            s = iterator.next();
            System.out.println(s);
        }

        for(String st : iteFactory)
            System.out.println(st);

        Collection<Integer> cint = Arrays.asList(1, 5, 3, 4, 8, 7);

        for(Integer i : cint)
        {
            i++;
        }

        for(Integer i : cint)
        {
            System.out.println(i);
        }
    }
}
