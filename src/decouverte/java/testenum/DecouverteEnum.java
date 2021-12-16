package decouverte.java.testenum;

public class DecouverteEnum
{
    public static void main(String[] args)
    {
        JoursSemaine j = JoursSemaine.Lundi;
        JoursSemaine j2 = getJour();
        JoursSemaine[] values = JoursSemaine.values();

        if(j2 == JoursSemaine.Dimanche)
            System.out.println("On est dimanche");

        switch(j)
        {
            case Lundi:
                break;
            case Mardi:
                break;
        }

        print(j);

        j = JoursSemaine.valueOf("Dimanche");
        print(j);

        j = values[2];
        print(j);
    }

    private static JoursSemaine getJour()
    {
        return JoursSemaine.Dimanche;
    }

    private static void print(JoursSemaine j)
    {
        System.out.printf("%s (%se jour) (weekend ? %s) (nb heures = %s)%n"
                            , j.name(), (j.ordinal()+1), j.isWeekEnd(), j.getNbHeures());
    }
}
