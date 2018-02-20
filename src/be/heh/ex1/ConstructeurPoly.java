package be.heh.ex1;

import java.util.ArrayList;

public class ConstructeurPoly {

    ArrayList <Carre> carres;
    ArrayList <Triangle> triangles;



    ConstructeurPoly(){

        carres = new ArrayList <Carre>();
        triangles = new ArrayList <Triangle>();

        constructeurTriangle();
        constructeurCarre();

    }


   private void constructeurCarre(){

       triangles.add(new Triangle(4));
   }

   private void constructeurTriangle(){

       carres.add(new Carre(3));

   }
}
