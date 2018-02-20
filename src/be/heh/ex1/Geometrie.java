package be.heh.ex1;

import java.util.ArrayList;

public class Geometrie {

    public static double SommePerimetre(ConstructeurPoly test1){

        double sommeP = 0;

        for (int i=0;i<test1.carres.size();i++){

            sommeP += test1.carres.get(i).perimetre();

        }

        for (int i=0;i<test1.triangles.size();i++){

            sommeP += test1.triangles.get(i).perimetre();

        }

        return sommeP;
    }

    public static double SommeAire(ConstructeurPoly test1){

        double sommeA = 0;

        for (int i=0;i<test1.carres.size();i++){

            sommeA += test1.carres.get(i).aire();

        }

        for (int i=0;i<test1.triangles.size();i++){

            sommeA += test1.triangles.get(i).aire();

        }

        return sommeA;
    }

}
