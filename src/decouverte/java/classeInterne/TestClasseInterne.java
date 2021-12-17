package decouverte.java.classeInterne;

import decouverte.java.collection.Personne;

import java.util.Comparator;
import java.util.TreeSet;

public class TestClasseInterne
{
    private static class MyComparator implements Comparator<Personne>
    {

        @Override public int compare(Personne o1, Personne o2)
        {
            if(!o1.getBirthDate().equals(o2.getBirthDate())) return -o1.getBirthDate().compareTo(o2.getBirthDate());
            if (!o1.getName().equals(o2.getName())) return o1.getName().compareTo(o2.getName());
            return o1.getFirstName().compareTo(o2.getFirstName());
        }
    }

    public static void main(String[] args)
    {
        new TreeSet<>(getComparator());
    }

    private static Comparator<Personne> getComparator()
    {
        return (o1, o2) ->
        {
            if(!o1.getBirthDate().equals(o2.getBirthDate())) return -o1.getBirthDate().compareTo(o2.getBirthDate());
            if (!o1.getName().equals(o2.getName())) return o1.getName().compareTo(o2.getName());
            return o1.getFirstName().compareTo(o2.getFirstName());
        };
    }
}
