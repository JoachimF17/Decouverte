package decouverte.java.collection;

import java.util.HashSet;
import java.util.TreeSet;

public class SetDeco
{
    public static void main(String[] args)
    {
        //variables
        boolean added = false;
        //objets
        TreeSet<Personne> personnes = new TreeSet<>(new BirthDateNameFirstNameComparator());
        Personne[] personnesTab = PersonneFactory.getPersonnesTab();

        for(Personne p : personnesTab)
        {
            added = personnes.add(p);
            System.out.println(added + " " + p);
        }

        System.out.println();

        for(Personne p : personnes)
            System.out.println(p);
    }
}
