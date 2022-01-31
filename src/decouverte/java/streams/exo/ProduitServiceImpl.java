package decouverte.java.streams.exo;

import java.util.*;

public class ProduitServiceImpl implements ProduitService
{
    private final List<Produit> list = new ArrayList<>();

    @Override
    public List<Produit> getAll()
    {
        return list;
    }

    @Override
    public Produit getOne(int id)
    {
        return list.stream()
                    .filter(p -> p.getId() == id)
                    .findFirst().orElse(null);
    }

    @Override
    public boolean insert(Produit toAdd)
    {
        boolean dontAdd = list.stream()
                .anyMatch(p -> p.getId() == toAdd.getId());

        if(!dontAdd)
        {
            list.add(toAdd);
            return true;
        }else
            return false;
    }

    @Override
    public Produit delete(int id)
    {
        Produit p = list.stream()
                .filter(produit -> produit.getId() == id)
                .findFirst().orElse(null);

        if(p != null)
            list.remove(p);

        return null;
    }

    @Override
    public List<Produit> getAllSorted(Comparator<Produit> comparator)
    {
        return list.stream()
                   .sorted(comparator)
                   .toList();
    }

    @Override
    public Produit getCheapest()
    {
        return list.stream()
                    .min(Comparator.comparingDouble(Produit::getPrix))
                    .orElse(null);
    }

    @Override
    public Produit getMostExpensive()
    {
        return list.stream()
                    .max(Comparator.comparingDouble(Produit::getPrix))
                    .orElse(null);
    }

    @Override
    public List<Produit> getAllByBrand(String brand)
    {
        return list.stream()
                    .filter(p -> Objects.equals(p.getMarque(), brand))
                    .toList();
    }
}
