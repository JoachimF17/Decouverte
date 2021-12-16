package decouverte.java.testenum;

public enum JoursSemaine
{
    Lundi(false),
    Mardi(false),
    Mercredi(false, 4),
    Jeudi(false),
    Vendredi(false),
    Samedi(true),
    Dimanche(true);

    private boolean weekEnd;
    private int nbHeures;

    JoursSemaine(boolean weekEnd)
    {
        this(weekEnd, weekEnd ? 0 : 8);
    }

    JoursSemaine(boolean weekEnd, int nbHeures)
    {
        this.nbHeures = nbHeures;
        this.weekEnd = weekEnd;
    }

    public boolean isWeekEnd()
    {
        return this.weekEnd;
    }

    public int getNbHeures()
    {
        return this.nbHeures;
    }
}
