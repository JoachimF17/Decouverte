package decouverte.java.collection;

import java.time.LocalDate;

public class PersonneFactory
{
    public static Personne[] getPersonnesTab()
    {
        return new Personne[]
                {
                new Personne("Dupond", "toto", LocalDate.of(1990, 5, 15)),
                new Personne("Dupond", "toto", LocalDate.of(1990, 5, 15)),
                new Personne("Dupond", "toto", LocalDate.of(1992, 5, 15)),
                new Personne("Dupont", "dédé", LocalDate.of(1991, 5, 15)),
                new Personne("Dupond", "dédé", LocalDate.of(1990, 6, 15)),
                new Personne("Dapond", "luc", LocalDate.of(1990, 5, 16)),
                new Personne("Dapond", "marc", LocalDate.of(1990, 5, 16)),
                new Personne("Dupond", "lucien", LocalDate.of(1990, 5, 14)),
                };
    }
}