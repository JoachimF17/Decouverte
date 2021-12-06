package decouverte.java.equals;

public class TestEquals
{
    public static void main(String[] args)
    {
        Personne p1 = new Personne("Dupont", "Toto", "etudiant");
        Personne p2 = new Personne("Dupont", "Toto", "etudiant");
        Personne p3 = p1;
        Personne p4 = new Personne("Dupont", "Totot", "etudiant");
        Personne p5 = new Personne("Dupont", "Toto", "plombier");

        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
        System.out.println(p1.equals(p4));
        System.out.println(p1.equals(p5));

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());
        System.out.println(p4.hashCode());
        System.out.println(p5.hashCode());
    }
}
