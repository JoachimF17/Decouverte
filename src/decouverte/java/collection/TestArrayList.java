package decouverte.java.collection;

import java.util.ArrayList;

public class TestArrayList
{
    public static void main(String[] args)
    {
        ArrayList<String> liste = new ArrayList<>();

        System.out.println(liste.size());

        liste.add("toto");
        liste.add("dede");
        liste.add("dedede");

        System.out.println(liste.size());

        System.out.println(liste.get(0));
    }
}
