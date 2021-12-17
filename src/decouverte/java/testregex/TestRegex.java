package decouverte.java.testregex;

import java.util.Scanner;

public class TestRegex
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez une date au format d/m/yyyy : ");

        if(sc.nextLine().matches("([4-9]|[1-2][0-9]?|3[0-1]?)/([2-9]|1[0-2]?)/([1-9][0-9]{3})"))
            System.out.println("C'est bon");
        else
            System.out.println("C'est pas bon");
    }
}
