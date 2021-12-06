package decouverte.java.constructeurs;

public class TestConstructeurs
{
    public static void main(String[] args)
    {
        Descendant desc = new Descendant();
        Descendant desco = new Descendant(752);

        System.out.println(desc);
        System.out.println(desco);
    }
}

class Descendant extends Ancetre
{
    private int iDesc;

    Descendant()
    {
        super(4);
        this.iDesc = 0;
    }

    Descendant(int iDesc)
    {
        super(iDesc);
        this.iDesc = iDesc;
    }

    @Override public String toString()
    {
        return super.toString() + "\nDescendant{" +
                "iDesc=" + iDesc +
                '}';
    }
}

class Ancetre
{
    protected int iAnc = 1;

    Ancetre(int iAnc)
    {
        this.iAnc = iAnc;
    }

    @Override public String toString()
    {
        return "Ancetre{" +
                "iAnc=" + iAnc +
                '}';
    }
}