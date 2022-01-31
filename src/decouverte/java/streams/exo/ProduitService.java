package decouverte.java.streams.exo;

import java.util.Comparator;
import java.util.List;

public interface ProduitService
{
    List<Produit> getAll();
    Produit getOne(int id);

    /**
     * Ajoute un produit a
     * Pas de null
     * id doit etre unique
     * @param toAdd le produit a ajouter
     * @return <code>true</code> si le produit est ajouté; <code>false</code> sinon
     */
    boolean insert(Produit toAdd);
    Produit delete(int id);

    List<Produit> getAllSorted(Comparator<Produit> comparator);
    Produit getCheapest();
    Produit getMostExpensive();
    List<Produit> getAllByBrand(String brand);
}
