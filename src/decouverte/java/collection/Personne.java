package decouverte.java.collection;

import java.time.LocalDate;

public class Personne implements Comparable<Personne>
{
    //attributs
    private String name;
    private String firstName;
    private LocalDate birthDate;

    //methodes
    //constructeur avec params
    public Personne(String name, String firstName, LocalDate birthDate)
    {
        this.name = name;
        this.firstName = firstName;
        this.birthDate = birthDate;
    }

    //getters
    public String getName()
    {
        return name;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public LocalDate getBirthDate()
    {
        return birthDate;
    }
    //fin getters

    //setters
    public void setName(String name)
    {
        this.name = name;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public void setBirthDate(LocalDate birthDate)
    {
        this.birthDate = birthDate;
    }
    //fin setters


    @Override public String toString()
    {
        return "Personne{" +
                "Nom='" + name + '\'' +
                ", Prenom='" + firstName + '\'' +
                ", Date de naissance=" + birthDate +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Personne personne = (Personne) o;

        if (name != null ? !name.equals(personne.name) : personne.name != null) return false;
        if (firstName != null ? !firstName.equals(personne.firstName) : personne.firstName != null) return false;
        return birthDate != null ? birthDate.equals(personne.birthDate) : personne.birthDate == null;
    }

    @Override
    public int hashCode()
    {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (birthDate != null ? birthDate.hashCode() : 0);
        return result;
    }

    @Override public int compareTo(Personne o)
    {
        return 0;
    }
}
