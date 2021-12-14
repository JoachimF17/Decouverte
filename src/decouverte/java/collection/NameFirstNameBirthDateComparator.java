package decouverte.java.collection;

import java.util.Comparator;

public class NameFirstNameBirthDateComparator implements Comparator<Personne>
{
    @Override public int compare(Personne o1, Personne o2)
    {
        if (!o1.getName().equals(o2.getName())) return o1.getName().compareTo(o2.getName());
        if (!o1.getFirstName().equals(o2.getFirstName())) return o1.getFirstName().compareTo(o2.getFirstName());
        return -o1.getBirthDate().compareTo(o2.getBirthDate());
    }
}
