package decouverte.java.equals;

import java.util.Objects;

public class Personne
{
    private String nom;
    private String prenom;
    private String profession;

    Personne(String nom, String prenom, String profession)
    {
        this.nom = nom;
        this.prenom = prenom;
        this.profession = profession;
    }

    /*@Override public boolean equals(Object obj)
    {
        boolean egal = false;

        if(obj != null && obj.getClass() == this.getClass())
        {
            Personne other = (Personne) obj;

            if (this.nom.equals(other.nom) && this.prenom.equals(other.prenom))
                egal = true;
        }

        return egal;
    }*/

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personne personne = (Personne) o;
        return Objects.equals(nom, personne.nom) && Objects.equals(prenom, personne.prenom);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(nom, prenom);
    }
}
