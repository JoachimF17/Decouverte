package decouverte.java.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryWithRessource
{
    public static void main(String[] args)
    {
        File f = new File("toto.txt");

        try(Scanner sc = new Scanner(f))
        {
            while(sc.hasNext())
                System.out.println(sc.nextLine());
        }catch (FileNotFoundException e)
        {
            System.out.println("toto.txt n'existe pas");
        }
    }
}
