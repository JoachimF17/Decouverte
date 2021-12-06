package decouverte.java.primitif;

public class AutoBoxing
{
    public static void main(String[] args)
    {
        //Boxing
        int i = 5;
        Integer ib = Integer.valueOf(i);

        //unBoxing
        int i2 = ib.intValue();

        //autoBoxing
        Integer box = i;

        //autoUnboxing
        int i3 = box;

        Object obj = box;
        obj = i;
    }
}