package decouverte.java.exceptions;

public class Decouverte
{
    public static void main(String[] args)
    {
        System.out.println("Decouverte.main debut");
        fct1(24);
        System.out.println("Decouverte.main fin");
    }

    private static void fct1(int i)
    {
        System.out.println("Decouverte.fct1 debut");

        try
        {
            System.out.println("Decouverte.fct1 debut try");
            fct2(i);
            System.out.println("Decouverte.fct1 fin try");
        }catch(IllegalArgumentException | PresqueValideException e)
        {
            System.out.println(e.getMessage());
        }catch(Exception e)
        {
            System.out.println("Exception");
        }finally
        {
            System.out.println("Boum badaboum");
        }

        System.out.println("Decouverte.fct1 fin");
    }

    private static void fct2(int i) throws PresqueValideException
    {
        System.out.println("Decouverte.fct2 debut");
        fct3(i);
        System.out.println("Decouverte.fct2 fin");
    }

    private static void fct3(int i) throws PresqueValideException
    {
        System.out.println("Decouverte.fct3 debut");
        if(i < 10)
            throw new IllegalArgumentException(String.format("La valeur (%s) est non vali1de", i));

        if(i < 15)
            throw new PresqueValideException("Presque");

        String a = null;
        System.out.println(a.length());

        System.out.println("Valeur : "+i);

        System.out.println("Decouverte.fct3 fin");
    }
}
