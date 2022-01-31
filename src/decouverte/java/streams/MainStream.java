package decouverte.java.streams;

import decouverte.java.streams.exo.Produit;
import decouverte.java.streams.exo.ProduitServiceImpl;

import java.util.Comparator;
import java.util.List;

public class MainStream
{
    public static void main(String[] args)
    {
        ProduitServiceImpl psi = new ProduitServiceImpl();

        System.out.println("----- ADD -----");
        System.out.println(psi.insert(new Produit(1, "Chocolat Noir", "Galler", 8.50)));
        System.out.println(psi.insert(new Produit(2, "Riz", "Uncle Ben's", 2.50)));
        System.out.println(psi.insert(new Produit(3, "Chocolat Blanc", "Galler", 7.0)));
        System.out.println(psi.insert(new Produit(4, "Sucre", "Tirlemont", 3.0)));
        System.out.println(psi.insert(new Produit(5, "Café", "Café Liégeois", 12.20)));
        System.out.println(psi.insert(new Produit(6, "Bananes", "Chiquita", 4.0)));
        System.out.println(psi.insert(new Produit(6, "Produit pas ajoute", "False", 0.0)));
        System.out.println("----- FIN ADD -----\n");

        System.out.println("----- GET ONE -----");
        System.out.println("id = 4 : "+psi.getOne(4));
        System.out.println("----- FIN GET ONE -----\n");

        System.out.println("----- DELETE -----");
        System.out.println("id = 6 : "+psi.delete(6));
        System.out.println("----- FIN DELETE -----\n");

        System.out.println("----- GET SORTED (PRICE) -----");
        psi.getAllSorted(Comparator.comparingDouble(Produit::getPrix)).forEach(System.out::println);
        System.out.println("----- FIN GET SORTED -----\n");

        System.out.println("----- GET CHEAPEST -----");
        System.out.println(psi.getCheapest());
        System.out.println("----- FIN GET CHEAPEST -----\n");

        System.out.println("----- GET EXPENSIVE -----");
        System.out.println(psi.getMostExpensive());
        System.out.println("----- FIN GET EXPENSIVE -----\n");

        System.out.println("----- GET ALL BY BRAND (GALLER) -----");
        psi.getAllByBrand("Galler").forEach(System.out::println);
        System.out.println("----- FIN GET ALL BY BRAND -----\n");


    }
}
