package decouverte.java.troisPetitsPoints;

public class TestTroisPP
{
    public static void main(String[] args)
    {
        //ancienne technique
        String[] tab = new String[]{"st1", "st2", "st3"};
        String result = concatAnc(tab);

        //nouvelle technique
        String res2 = concatNew("st1", "st2", "st3");

        System.out.println(result);
        System.out.println(res2);
    }

    //ancienne methode
    private static String concatAnc(String[] tab)
    {
        String result = "";

        for(String s : tab)
            result += s;

        return result;
    }

    //nouvelle methode
    private static String concatNew(String... tab)
    {
        String result = "";

        for(String s : tab)
            result += s;

        return result;
    }

}
