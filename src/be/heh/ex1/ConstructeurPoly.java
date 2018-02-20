package be.heh.ex1;

import java.util.ArrayList;

public class ConstructeurPoly {

    ArrayList <Carre> carres;
    ArrayList <Triangle> triangles;



    ConstructeurPoly(){

        carres = new ArrayList <>();
        triangles = new ArrayList <>();

        constructeurTriangle();
        constructeurCarre();

    }


   private void constructeurTriangle(){

       triangles.add(new Triangle(4));
       triangles.add(new Triangle(1));
       triangles.add(new Triangle(9));
   }

   private void constructeurCarre(){

       carres.add(new Carre(3));
       carres.add(new Carre(10));
       carres.add(new Carre(1));

   }
}
