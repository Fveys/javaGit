package be.heh.ex1;

public class Affichage {

    public static void affichage(ConstructeurPoly poly){

        System.out.println("Voici le total des périmetres : " + Geometrie.SommePerimetre(poly) );
        System.out.println("Et celui des aires : " + Geometrie.SommeAire(poly) );

        System.out.println();

        System.out.println("Voici le tableau de carrés :");
        for (int i = 0; i < poly.carres.size(); i++){

            System.out.println("carré " + i + " : " + poly.carres.get(i));

        }

        System.out.println();

        System.out.println("Voici le tableau de triangle :");
        for (int i = 0; i < poly.triangles.size(); i++){

            System.out.println("triangle " + i + " : " + poly.triangles.get(i));

        }

    }

}
